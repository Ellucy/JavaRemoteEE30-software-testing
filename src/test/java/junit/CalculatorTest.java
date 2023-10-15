package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {

        //given
        Calculator testObj = new Calculator();

        //when
        int actualResult = testObj.add(3,5);

        //then
        assertEquals(8, actualResult);

    }

    //happy-path test
    @Test
    void divide() {
        //given
        Calculator testObj = new Calculator();

        //when
        int actualResult = testObj.divide(8,2);

        //then
        assertEquals(4, actualResult);
    }

    //testing edge case
    @Test
    void testDivideByZero_ShouldReturnNegativeOne() {
        //given
        Calculator testObj = new Calculator();

        //when
        int actualResult = testObj.divide(8, 0);

        //then
        assertEquals(-1, actualResult);
    }


}