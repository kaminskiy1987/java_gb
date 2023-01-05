package HomeWork3_OOP.Classes;

public class Worker extends Person{
    int id;

    public Worker(int age, int salary, String firstname, String surname){
        super(age, salary, firstname, surname);
        this.id = CurrentId.getCurrentId();
    }
    /**
     * Геттеры и сеттеры класса Worker
     * Переопределенный метод toString
     */
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "id:" + this.id + super.toString() +"salary:" + this.salary;
    }
}