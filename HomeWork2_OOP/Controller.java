package HomeWork2_OOP;

import HomeWork2_OOP.Human;
import HomeWork2_OOP.Relations;
import HomeWork2_OOP.Relatives;

import java.util.*;

public class Controller {
    private static Loader loader;
    private static List<Human> humans;
    private static List<Relatives> bloodLine;
    public List<Relatives> tree = new ArrayList<>();

    public static void runAlgorithm(Controller controller, Scanner scanner) {
        loader.loadListName(humans, bloodLine);
        controller.buildTree(humans.get(0), bloodLine);
        runMenu(scanner, controller);

        scanner.close();
    }

    public Controller() {
    }

    public Controller(Loader loader, List<Human> humans, List<Relatives> bloodLine) {
        Controller.loader = loader;
        Controller.humans = humans;
        Controller.bloodLine = bloodLine;
    }

    static void runMenu(Scanner scanner, Controller controller) {
        View view = new View();
        String choice;

        do {
            view.printMenu();
            choice = scanner.next();

            switch (choice) {
                case "1":
                    view.printTree(controller.tree);
                    break;
                case "2":
                    view.printFullHumanList(humans);
                    break;
                case "3":
                    view.printFullRelativesList(bloodLine);
                    break;
                case "4":
                    searchInMenu(scanner, view, controller);
                    break;
                case "5":
                    break;
                case "0":
                    choice = "Выход";
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    break;
            }

            scanner.reset();

        } while (!choice.equals("Выход"));
    }

    static void searchInMenu(Scanner scanner, View view, Controller controller) {
        System.out.print("Введите фамилию: ");
        String surname = scanner.next();
        System.out.print("Введите имя: ");
        String name = scanner.next();
        List<Relatives> humans = controller.searchHuman(bloodLine, surname, name);

        if (humans.size() > 0)
            view.printFullRelativesList(humans);
        else
            System.out.println("Нет совпадений");

        scanner.reset();

    }

    public List<Relatives> searchHuman(List<Relatives> list, String surname, String name) {
        List<Relatives> coincidencesList = new ArrayList<>();

        for (Relatives r : list) {
            if (r.getFirst().getSecondName().equals(surname) &&
                    r.getFirst().getFirstName().equals(name)) {
                coincidencesList.add(r);
            }
        }

        return coincidencesList;
    }

    List<Relatives> searchByStatus(Human person, Relations status, List<Relatives> list) {
        List<Relatives> statusList = new ArrayList<>();

        for (Relatives r : list) {
            if (r.getFirst().equals(person) && r.getRelations().equals(status)) {
                statusList.add(r);
            }
        }

        return statusList;
    }

    public void buildTree(Human startPerson, List<Relatives> list) {
        tree.addAll(searchByStatus(startPerson, Relations.SPOUSE, list));
        List<Relatives> treeList = (searchByStatus(startPerson, Relations.FATHER, list));
        tree.addAll(treeList);

        for (Relatives persons : treeList) {
            buildTree(persons.getSecond(), list);
        }
    }
}