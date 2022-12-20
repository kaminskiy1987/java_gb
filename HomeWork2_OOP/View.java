package HomeWork2_OOP;

import HomeWork2_OOP.Human;
import HomeWork2_OOP.Relations;
import HomeWork2_OOP.Relatives;

import java.util.List;

public class View {
    public void printTree(List<Relatives> list) {
        for (Relatives r : list) {
            if (r.getRelations().equals(Relations.FATHER)) {
                System.out.print("||    |\n||    |____");
                System.out.println("родители  для " + r.getSecond());
            } else {
                System.out.print("||\n||_");
                System.out.println(r);
            }
        }
    }

    public void printFullRelativesList(List<Relatives> list) {
        for (Relatives pair : list) {
            if (pair.getRelations().equals(Relations.FATHER)) {
                System.out.println(pair.getFirst() + " отец  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.MOTHER)) {
                System.out.println(pair.getFirst() + " мать  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.SON)) {
                System.out.println(pair.getFirst() + " сын  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.DAUGHTER)) {
                System.out.println(pair.getFirst() + " дочь  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.GRANDFATHER)) {
                System.out.println(pair.getFirst() + " дедушка  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.GRANDMOTHER)) {
                System.out.println(pair.getFirst() + " бабушка  для " + pair.getSecond());
            } else if (pair.getRelations().equals(Relations.SPOUSE)) {
                System.out.println(pair.getFirst() + " и " + pair.getSecond() + " супруги ");
            } else if (pair.getRelations().equals(Relations.GRANDSON)) {
                System.out.println(pair.getFirst() + " внук для " + pair.getSecond());
            }
        }
    }

    public void printFullHumanList(List<Human> list) {
        for (Human person : list)
            System.out.println(person);
    }

    public void printMenu() {
        String menuLine = "\n" +
                "Выберите номер команды:\n" +
                "1: Печать генеалогического древа\n" +
                "2: Печать списка людей\n" +
                "3: Печать списка родственников\n" +
                "4: Поиск человека\n" +
                "0: Выход\n" + "> ";

        System.out.print(menuLine);
    }
}