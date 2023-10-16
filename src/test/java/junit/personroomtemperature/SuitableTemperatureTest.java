package junit.personroomtemperature;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuitableTemperatureTest {

    @Test
    public void testDetermineWellbeing_TeenagerLowTemperature() {

        //given
        Person teenagerObj = new Person("Mia", 13);
        FahrenheitCelciusConverter roomObj = new FahrenheitCelciusConverter();
        roomObj.setCelsius(15);

        //when ( Redirect standard output to capture printed messages)
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SuitableTemperature.determineWellbeing(teenagerObj, roomObj);

        //then
        String expectedOutput = "Time to contact Child Protective Services. The temperature (15 C) in Mia's room is too low!";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testDetermineWellbeing_TeenagerNormalTemperature() {

        //given
        Person teenagerObj = new Person("Jonas", 11);
        FahrenheitCelciusConverter roomObj = new FahrenheitCelciusConverter();
        roomObj.setCelsius(22);

        //when
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SuitableTemperature.determineWellbeing(teenagerObj, roomObj);

        //then
        String expectedOutput = "All good";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testDetermineWellbeing_AdultTemperature() {

        //given
        Person teenagerObj = new Person("Mike", 41);
        FahrenheitCelciusConverter roomObj = new FahrenheitCelciusConverter();
        roomObj.setCelsius(22);

        //when
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SuitableTemperature.determineWellbeing(teenagerObj, roomObj);

        //then
        String expectedOutput = "Adults should be able to take care of themselves.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testDetermineWellbeing_BabyTemperature() {

        //given
        Person teenagerObj = new Person("Ronja", 2);
        FahrenheitCelciusConverter roomObj = new FahrenheitCelciusConverter();
        roomObj.setCelsius(22);

        //when
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SuitableTemperature.determineWellbeing(teenagerObj, roomObj);

        //then
        String expectedOutput = "It's a baby/toddler. Sorry, we don't have data about suitable temperatures for people under 10.";
        assertEquals(expectedOutput, outContent.toString().trim());
    }
}
