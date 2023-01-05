package HomeWork3_OOP.Model;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Model {
    public static void saveFile(String text, String path ){
        try (FileWriter fw = new FileWriter(path, false)){
            fw.write(text);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}