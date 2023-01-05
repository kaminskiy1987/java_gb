package HomeWork3_OOP.Interface;

import HomeWork3_OOP.Classes.Person;

public interface TitleFormat {
    /**
     * интерфейс создания строк разных форматов
     */
    <T extends Person> String createString(T person);
}
