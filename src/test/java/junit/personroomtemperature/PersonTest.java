package junit.personroomtemperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void isTeenager() {
        //given
        Person personObj = new Person("John", 15);

        //when
        boolean actualResult = personObj.isTeenager();

        //then
        assertTrue(actualResult);
    }

    @Test
    public void isNotTeenager() {
        //given
        Person personObj = new Person("Jack", 29);

        //when
        boolean actualResult = personObj.isTeenager();

        //then
        assertFalse(actualResult);
    }

    @Test
    public void ageIsPositiveNumber() {
        //given
        Person personObj = new Person("Laura", -10);

        //when
        int age = personObj.getAge();

        //then
        assertEquals(0, age);
    }

    @Test
    public void ageIsSetWhenPositiveNumberOtherwiseZero() {
        //given
        Person person = new Person("Laura", 20);

        //when
        person.setAge(-30);
        int age = person.getAge();

        //then
        assertEquals(0, age);
    }
}