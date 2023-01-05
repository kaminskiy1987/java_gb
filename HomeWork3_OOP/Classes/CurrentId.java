package HomeWork3_OOP.Classes;

public class CurrentId {
    private static int currentId = 0;
    /**
     * метод подсчета  id
     */
    public static int getCurrentId() {
        return currentId++;
    }
}