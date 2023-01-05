package HomeWork3_OOP.Model;

import HomeWork3_OOP.Interface.TitleFormat;
import HomeWork3_OOP.Classes.Person;

public class JsonFormat implements TitleFormat{
    /**
     * Переопределенный метод createString для формата JSON
     */
    @Override
    public <T extends Person> String  createString(T person) {
        return String.format("{\n" +
                "\"worker\" : {\n" +
                "\"age\":%d,\n" +
                "\"salary\":%d,\n" +
                "\"Firstname\": %s,\n" +
                "\"Surname\":%s,\n" +
                "}\n" +
                "};", person.getAge(), person.getSalary(), person.getFirstname(), person.getSurname());
    }
}