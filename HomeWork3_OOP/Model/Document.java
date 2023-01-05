package HomeWork3_OOP.Model;

import HomeWork3_OOP.Interface.TitleFormat;
import HomeWork3_OOP.Classes.Person;

public class  Document <T extends Person>{
    TitleFormat format;
    String text;
    String path;
    T person;

    public Document(T person){
        this.person = person;
    }

    /**
     * сеттеры класса Document
     * Метод сохранения в соответсвующем формате
     */
    public void setFormat(TitleFormat format) {
        this.format = format;
    }
    
    public void setPath(String path){
        this.path = path;
    }

    public <T extends Person> void saveInFormat(){
        text = format.createString(person);
        Model.saveFile(text, this.path);
    }
}