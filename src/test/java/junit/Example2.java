package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Example2 {

    @Test
    public void testAdd() {

        //given
        Calculator testObj = new Calculator();
        int expectedResult = 8;

        //when
        int actualResult = testObj.add(5,3);

        //then
        //doesn't matter what you put first, but expected usually is put first
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testDivide() {
        //given
        Calculator testObj = new Calculator();
        int expectedResult = 2;

        //when
        int actualResult = testObj.divide(6,3);

        //then
        assertEquals(expectedResult, actualResult);
    }
}
