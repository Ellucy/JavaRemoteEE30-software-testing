package junit.personroomtemperature;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {

        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age has to be a positive number. For now we set to null. Change it whenever you want.");
            this.age = 0;
        }
    }

    public boolean isTeenager() {
        return age > 10 && age < 20;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }
}
