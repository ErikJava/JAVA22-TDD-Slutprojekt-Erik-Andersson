Testerna nedan är några som jag anser varit viktigast, finns säkerligen fler som går att testa men dessa var dom som jag tänkte på:

TEST BUFFER;

isBufferNotEmpty:
Kontrollerar att buffer ej är tom efter att objekt lagts till.
Testar att producer lägger till objekt i bufferten och att consumer kan förbruka.

isBufferEmpty:
ontrollerar att buffer är tom efter att objekt har lagts till och förbrukats.
Validerar att consumer tar bort objekt från buffer och att den är tom.

testException:
Testar InterruptedException vid borttagning av objekt.
Säkerställer att consumer hanterar Exception korrekt efter förbrukning.

testReturnTrue:
Validerar att consumer's addItem-metod returnerar true när ett objekt lagts till.
Bekräftar tillägget av ett objekt av producer.

testOutput:
Kontrollerar om rätt output visas.
Verifierar att producers tillagda objekt resulterar i korrent output.


TEST ITEM;

testEmptyStringToSetID:
Testar en tom String som ID för objekt.
Säkerställer att det fungerar att sätta en tom String som ID.

testIntegersInsteadOfLettersSetID:
Testar att Integers kan sättas som ID för objekt.
Säkerställer att objektet hanterar Integers korrekt som ID.

testLowerCaseSetId:
Testar att sätta LowerCase som ID för objekt.
Bekräftar att det fungerar att sätta LowerCase som ID.

testNull:
Testar att sätta ett ID till null, throws NullPointerException.
Säkerställer att objektet hanterar null-värden för ett ID.

testIdLowerCase:
Testar att metoden "getId" returnerar ID till LowerCase.
Säkerställer bokstavsstorlek för returnerade ID.

testIdIsNull:
Testar om det är möjligt att skapa ett objekt med ett null-ID och om det throws NullPointerException.
Bekräftar att constructor hanterar null-ID på rätt sätt.

testEmptyString:
Testar om en tom String hanteras korrekt som ett ID.
Säkerställer att objektet kan hantera och lagra en tom String som ett ID.

testLowerCaseToString:
Testar att metoden toString returnerar en ett ID till små bokstäver.
Garanterar storlek av bokstäver för den returnerade Stringen.

testIntegersInsteadOfLetters:
Testar att skapa objekt med Integers som ett ID.
Bekräftar att objektet kan hantera Integers som ett ID.

testIntegersToString:
Testar om metoden toString hanterar Integers som ett ID på ett korrekt sätt.
Säkerställer att Strings av ett objekt fungerar med Integers som ett ID.

testEmptyStringToString:
Testar att metoden toString fungerar med en tom String som ett ID.
Säkerställer att en String av objektet hanterar tomma ID på ett rätt sätt.
