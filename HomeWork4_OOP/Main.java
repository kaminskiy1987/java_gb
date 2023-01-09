package HomeWork4_OOP;

public class Main {
    /**
     * Точка входа
     */
    public static void main(String[] args) {
        Chat gb = new Chat();

        /**
         * Инициализация пользователей
         */
        Model client1 = new Model("Ivan", gb);
        Model client2 = new Model("Roman", gb);
        Model client4 = new Model("Alla", gb);

        /**
         * Добавление пользователей в чат
         */
        gb.addClientInChat(client1);
        gb.addClientInChat(client2);
        gb.addClientInChat(client4);

        /**
         * Отправка сообщений пользователей в чате
         */
        client1.sendMessageClient("Hello!");

        client2.sendMessageClient("Hey!");

        Model client3 = new Model("Slava", gb);
        gb.addClientInChat(client3);

        client3.sendMessageClient("Good day!");

        client4.sendMessageClient("How are you? =)");

        client4.setNameClient("Mark");
        client4.sendMessageClient("I changed my name!)");
    }
}