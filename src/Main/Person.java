package Main;

/**
 * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 */
public class Person {
    private String FIO;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private byte age;

    public Person(String FIO, String position, String email, String phone, double salary, byte age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public byte getAge() {
        return age;
    }

    public void setPerson(String FIO, String position, String email, String phone, double salary, byte age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    
    public void printPerson() {
        System.out.println( "FIO - " + this.getFIO() +
                            "; position - " + this.getPosition() +
                            "; e-mail - " + this.getEmail() +
                            "; phone - " + this.getPhone() +
                            "; salary - " + this.getSalary() +
                            "; age - " + this.getAge() );
    }
}
