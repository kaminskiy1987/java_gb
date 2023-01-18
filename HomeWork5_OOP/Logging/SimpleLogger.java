package HomeWork5_OOP.Logging;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import HomeWork5_OOP.Interfaces.ILogger;

import java.io.IOException;

public class SimpleLogger implements ILogger{
    protected Logger logger;
    protected FileHandler fh;
    protected SimpleFormatter sFormat;

    /**
     * Методы getLog, log отвечают за логирование и запись в файл
     */
    public Logger getLog () throws IOException {
        this.logger = Logger.getAnonymousLogger();
        this.fh = new FileHandler(
                "logCalc.txt");
        logger.addHandler(fh);
        return logger;
    }

    public void log(String myText) {
        this.sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(myText);
    }

    public void log(String className,String methodName, String message){
        this.sFormat = new SimpleFormatter();
        this.fh.setFormatter(sFormat);
        logger.logp(Level.INFO, className, methodName, message);
    }
    
}