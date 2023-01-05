package HomeWork3_OOP.Model;

import HomeWork3_OOP.Interface.TitleFormat;
import HomeWork3_OOP.Classes.Person;

public class MdFormat implements TitleFormat{
    /**
     * Переопределенный метод createString для формата MD
     */
    @Override
    public <T extends Person> String createString(T person) {
        return String.format("# worker:\n" +
                "* age: %d,\n" +
                "* salary: %d,\n" +
                "* Firstname: %s,\n" +
                "* Surname: %s", person.getAge(), person.getSalary(), person.getFirstname(), person.getSurname());
    }
}