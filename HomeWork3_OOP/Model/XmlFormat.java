package HomeWork3_OOP.Model;

import HomeWork3_OOP.Interface.TitleFormat;
import HomeWork3_OOP.Classes.Person;

public class XmlFormat implements TitleFormat{
    /**
     * Переопределенный метод createString для формата XML
     */
    @Override
    public <T extends Person> String createString(T person) {
        return String.format("<xml>\n" +
                "<Worker>\n" +
                "<age>%d</age>\n" +
                "<salary>%d</salary>\n" +
                "<Firstname>%s</Firstname>\n" +
                "<Surname>%s</Surname>\n" +
                "</Worker>" +
                "</xml>", person.getAge(), person.getSalary(), person.getFirstname(), person.getSurname());
    }
}