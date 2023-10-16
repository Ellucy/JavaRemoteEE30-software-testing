package junit.personroomtemperature;

public class FahrenheitCelciusConverter {
    private int fahrenheit;
    private int celsius;

    FahrenheitCelciusConverter() {
    }

    public int getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(int fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public int getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        this.celsius = celsius;
    }

    // Method to convert Fahrenheit to Celsius
    public int toCelsius(int fahrenheit) {
        celsius = (int) ((fahrenheit - 32) * 5.0 / 9.0);
        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public int toFahrenheit(int celsius) {
        fahrenheit = (int) (celsius * 9.0 / 5.0 + 32);
        return fahrenheit;
    }

}
