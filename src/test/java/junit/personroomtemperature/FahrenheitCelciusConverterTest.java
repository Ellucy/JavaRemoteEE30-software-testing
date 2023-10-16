package junit.personroomtemperature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FahrenheitCelciusConverterTest {

    @Test
    public void testSetFahrenheit() {
        //given
        FahrenheitCelciusConverter converterObj = new FahrenheitCelciusConverter();

        //when
        converterObj.setFahrenheit(77);
        int actualResult = converterObj.getFahrenheit();

        //then
        assertEquals(77, actualResult);
    }

    @Test
    public void testSetCelsius() {
        //given
        FahrenheitCelciusConverter converterObj = new FahrenheitCelciusConverter();

        //when
        converterObj.setFahrenheit(90);
        converterObj.setCelsius(converterObj.toCelsius(converterObj.getFahrenheit()));
        int result = converterObj.getCelsius();

        //then
        assertEquals(32, result);
    }

    @Test
    public void toFahrenheit() {
        //given
        FahrenheitCelciusConverter converterObj = new FahrenheitCelciusConverter();

        //when
        converterObj.setCelsius(37);
        converterObj.setFahrenheit(converterObj.toFahrenheit(converterObj.getCelsius()));
        int actualResult = converterObj.getFahrenheit();

        //then
        assertEquals(98, actualResult);
    }
}