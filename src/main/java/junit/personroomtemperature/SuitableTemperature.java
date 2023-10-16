package junit.personroomtemperature;

public class SuitableTemperature {

    public static void determineWellbeing(Person person, FahrenheitCelciusConverter room) {
        if (person.getAge() >= 10) {
            if (person.isTeenager() && (room.getCelsius() < 19 || room.getCelsius() > 25)) {
                String lowHigh = room.getCelsius() < 19 ? "low" : "high";
                System.out.println("Time to contact Child Protective Services. The temperature (" + room.getCelsius() + " C) in " + person.getName() + "'s room is too " + lowHigh + "!");
            } else if (!person.isTeenager()) {
                System.out.println("Adults should be able to take care of themselves.");
            } else {
                System.out.println("All good");
            }
        } else {
            System.out.println("It's a baby/toddler. Sorry, we don't have data about suitable temperatures for people under 10.");
        }
    }
}
