package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.mockedObjects.MockBuffer;
import test.mockedObjects.MockConsumer;
import test.mockedObjects.MockItem;
import test.mockedObjects.MockProducer;

public class TestBuffer {

    @Test
    @DisplayName("Testing if the Buffer is not empty")
    void IsBufferNotEmpty() {
        MockBuffer mockBuffer = new MockBuffer();
        MockProducer mockProducer = new MockProducer(mockBuffer);
        MockConsumer mockConsumer = new MockConsumer(mockBuffer);
        MockItem mockItem = new MockItem("test");
        mockProducer.addItem(mockItem);
        assertEquals(mockItem, mockConsumer.removeItem());

    }

    @Test
    @DisplayName("Testing if the Buffer is empty")
    void IsBufferEmpty() {
        MockBuffer mockBuffer = new MockBuffer();
        MockProducer mockProducer = new MockProducer(mockBuffer);
        MockConsumer mockConsumer = new MockConsumer(mockBuffer);
        MockItem mockItem = new MockItem("test");
        mockProducer.addItem(mockItem);
        mockConsumer.removeItem();
        Assertions.assertTrue(mockBuffer.getBuffer().isEmpty());
    }

    @Test
    @DisplayName("Testing Exception")
    void testException() {
        MockBuffer mockBuffer = new MockBuffer();
        MockConsumer mockConsumer = new MockConsumer(mockBuffer);
        Thread thread = new Thread(() -> assertThrows(InterruptedException.class, mockConsumer::removeItem));
        thread.start();
        thread.interrupt();
    }

    @Test
    @DisplayName("Testing if return value = true")
    void testReturnTrue() {
        MockBuffer mockBuffer = new MockBuffer();
        MockProducer mockProducer = new MockProducer(mockBuffer);
        MockItem mockItem = new MockItem("test");
        Assertions.assertTrue(mockProducer.addItem(mockItem));
    }

    @Test
    @DisplayName("Testing System out")
    void testOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        outContent.reset();

        MockBuffer mockBuffer = new MockBuffer();
        MockProducer mockProducer = new MockProducer(mockBuffer);
        MockItem mockItem = new MockItem("test");
        mockProducer.addItem(mockItem);
        Assertions.assertTrue(outContent.toString().contains("[test]"));
        outContent.reset();
        System.setOut(originalOut);

    }

}
