package HomeWork2_OOP;

import HomeWork2_OOP.Human;
import HomeWork2_OOP.Relations;
import HomeWork2_OOP.Relatives;

import java.util.List;

public class Loader {

    public void loadListName(List<Human> humans, List<Relatives> bloodline) {
        humans.add(new Human("Иван", "Иванов", 80)); // 0
        humans.add(new Human("Анна", "Иванова", 72)); // 1
        bloodline.add(new Relatives(humans.get(0), humans.get(1), Relations.SPOUSE));
        bloodline.add(new Relatives(humans.get(1), humans.get(0), Relations.SPOUSE));

        humans.add(new Human("Петр", "Иванов", 55)); // 2
        bloodline.add(new Relatives(humans.get(0), humans.get(2), Relations.FATHER));
        bloodline.add(new Relatives(humans.get(1), humans.get(2), Relations.MOTHER));
        bloodline.add(new Relatives(humans.get(2), humans.get(0), Relations.SON));
        bloodline.add(new Relatives(humans.get(2), humans.get(1), Relations.SON));

        humans.add(new Human("Светлана", "Иванова", 30)); // 3
        bloodline.add(new Relatives(humans.get(2), humans.get(3), Relations.SPOUSE));
        bloodline.add(new Relatives(humans.get(3), humans.get(2), Relations.SPOUSE));

        humans.add(new Human("Дмитрий", "Иванов", 12)); // 4
        bloodline.add(new Relatives(humans.get(2), humans.get(4), Relations.FATHER));
        bloodline.add(new Relatives(humans.get(3), humans.get(4), Relations.MOTHER));
        bloodline.add(new Relatives(humans.get(4), humans.get(2), Relations.SON));
        bloodline.add(new Relatives(humans.get(4), humans.get(3), Relations.SON));
        bloodline.add(new Relatives(humans.get(4), humans.get(0), Relations.GRANDSON));
        bloodline.add(new Relatives(humans.get(4), humans.get(1), Relations.GRANDSON));
        bloodline.add(new Relatives(humans.get(0), humans.get(4), Relations.GRANDFATHER));
        bloodline.add(new Relatives(humans.get(1), humans.get(4), Relations.GRANDMOTHER));
    }
}