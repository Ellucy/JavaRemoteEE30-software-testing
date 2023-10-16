package junit.personroomtemperature;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Stella", 12);
        FahrenheitCelciusConverter room1 = new FahrenheitCelciusConverter();

        Person person2 = new Person("Mike", 42);
        FahrenheitCelciusConverter room2 = new FahrenheitCelciusConverter();

        Person person3 = new Person("Sven", 19);
        FahrenheitCelciusConverter room3 = new FahrenheitCelciusConverter();

        Person person4 = new Person("Laura", -1);
        FahrenheitCelciusConverter room4 = new FahrenheitCelciusConverter();

        //let's say 19-25(inc) C is acceptable range

        room1.setFahrenheit(59);
        room1.setCelsius(room1.toCelsius(room1.getFahrenheit()));
        SuitableTemperature.determineWellbeing(person1, room1);

        room2.setFahrenheit(90);
        room2.setCelsius(room2.toCelsius(room2.getFahrenheit()));
        SuitableTemperature.determineWellbeing(person2, room2);

        room3.setFahrenheit(69);
        room3.setCelsius(room1.toCelsius(room3.getFahrenheit()));
        SuitableTemperature.determineWellbeing(person3, room3);

        room4.setFahrenheit(69);
        room4.setCelsius(room1.toCelsius(room4.getFahrenheit()));
        SuitableTemperature.determineWellbeing(person4, room4);
    }
}
