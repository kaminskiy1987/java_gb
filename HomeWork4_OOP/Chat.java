package HomeWork4_OOP;

import java.util.*;

public class Chat implements Chatroom {
    /**
     * Класс Chat имплементирует методы интерефейса Chatroom
     */
    ArrayList<Model> users = new ArrayList<>();

    /**
     * Переопределенный метод sendMessageInChat для отправки сообщений пользователем
     */
    @Override
    public void sendMessageInChat(String text, Model model) {
        for (Model u : users) {
            if (u.name.equals(model.name)) {
                u.printMessageClient(text);
            }
        }
    }

    /**
     * Переопределенный метод addClientInChat для добавления пользователя в чат
     */
    @Override
    public void addClientInChat(Model client) {
        System.out.println("\n >>> Новый пользователь! " + client.name);
        System.out.println();

        users.add(client);
    }
}