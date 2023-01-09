package HomeWork4_OOP;

public interface Chatroom {
    /**
     * интерфейс с методом добавления пользователей в чат и методом отправки сообщений в чате
     */
    void sendMessageInChat(String msg, Model user);

    void addClientInChat(Model user);
}