package HomeWork5_OOP.Interfaces;

import java.io.IOException;
import java.util.logging.Logger;

public interface ILogger {
    /**
     * интерфейс с методами логирования и записи в файл
     */
    Logger getLog () throws IOException;
    void log(String myText);
    void log(String string, String string2, String string3);
}