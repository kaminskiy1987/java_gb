package HomeWork3_OOP.Classes;

public abstract class Person {
    int age;
    int salary;
    String firstname;
    String surname;

    public Person(int age, int salary, String firstname, String surname){
        this.age = age;
        this.salary = salary;
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Геттеры и сеттеры класса Person
     * Переопределенный метод toString
     */
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "firstname:" + this.firstname + "surname:" + this.surname + "age:" + this.age + "salary:" + this.salary;
    }
}