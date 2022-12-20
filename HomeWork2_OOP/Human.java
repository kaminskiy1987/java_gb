package HomeWork2_OOP;

public class Human {
    private final String firstName;
    private final String secondName;
    private final int age;

    public Human(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        if (age >= 0 && age < 100)
            this.age = age;
        else
            throw new IllegalStateException("Неправильный возраст");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d лет)", secondName, firstName, age);
    }
}