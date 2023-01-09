package HomeWork4_OOP;

public class Model {
    String name;
    private final Chatroom chatroom;

    /**
     * Конструктор класса Model
     */
    public Model(String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    /**
     * Сеттер для возможности замены имени
     */
    public void setNameClient(String string) {
        System.out.println();
        System.out.println(">>>" + " " + this.name + " replace name to " + string);
        System.out.println();

        this.name = string;
    }

    /**
     * Метод печати сообщений пользователя
     */
    void printMessageClient(String message) {
        System.out.printf("%s: %s\n", name, message);
    }

    /**
     * Метод отправки сообщений пользователем
     */
    void sendMessageClient(String text) {
        chatroom.sendMessageInChat(text, this);
    }
}