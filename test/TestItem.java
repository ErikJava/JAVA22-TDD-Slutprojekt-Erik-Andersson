package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.mockedObjects.MockItem;

public class TestItem {

    @Test
    @DisplayName("Testing String with no value to setID")
    void testEmptyStringToSetID() {
        MockItem mockItem = new MockItem("test");
        mockItem.setId("");
        assertEquals("", mockItem.getId());
    }

    @Test
    @DisplayName("Testing Integers instead of letters setID")
    void testIntegersInsteadOfLettersSetID() {
        MockItem mockItem = new MockItem("TEST");
        mockItem.setId("789");
        assertEquals("789", mockItem.getId());
    }

    @Test
    @DisplayName("Testing Lowercase setID")
    void testLowerCaseSetId() {
        MockItem mockItem = new MockItem("TEST");
        mockItem.setId("test");
        assertEquals("test", mockItem.getId());
    }

    @Test
    @DisplayName("Testing value null setID")
    void testNull() throws NullPointerException {
        MockItem mockItem = new MockItem("Test");
        assertThrows(NullPointerException.class, () -> mockItem.setId(null));
    }

    @Test
    @DisplayName("Testing id = Lowercase")
    void testIdLowerCase() {
        MockItem mockItem = new MockItem("TEST");
        assertEquals("test", mockItem.getId());
    }

    @Test
    @DisplayName("Testing if id = Null")
    void testIdIsNull() {
        assertThrows(NullPointerException.class, () -> new MockItem(null));

    }

    @Test
    @DisplayName("Testing if id = String with no value")
    void testEmptyString() {
        MockItem mockItem = new MockItem("");
        assertEquals("", mockItem.getId());
    }

    @Test
    @DisplayName("Testing Lowercase toString")
    void testLowerCaseToString() {
        MockItem mockItem = new MockItem("TEST");
        assertEquals("test", mockItem.toString());
    }

    @Test
    @DisplayName("Testing Integers instead of letters")
    void testIntegersInsteadOfLetters() {
        MockItem mockItem = new MockItem("789");
        assertEquals("789", mockItem.getId());
    }

    @Test
    @DisplayName("Testing Integers instead of letters toString")
    void testIntegersToString() {
        MockItem mockItem = new MockItem("789");
        assertEquals("789", mockItem.toString());
    }

    @Test
    @DisplayName("Testing String with no value toString")
    void testEmptyStringToString() {
        MockItem mockItem = new MockItem("");
        assertEquals("", mockItem.toString());
    }

}
