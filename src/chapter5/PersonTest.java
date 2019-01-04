package chapter5;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PersonTest {
    @Test
    void personTest() {
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        assertEquals("김유신", personKim.name);
        assertEquals(85.5F, personKim.weight);
        assertEquals(180.0F, personKim.height);

        Person personLee = new Person("이순신", 175, 75);

        assertEquals("이순신", personLee.name);
        assertEquals(175, personLee.height);
        assertEquals(75, personLee.weight);
    }
}