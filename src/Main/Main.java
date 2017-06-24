package Main;

/*

* Создать массив из 5 сотрудников
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
* С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 32000, (byte) 60);
        persArray[1] = new Person("Petrov Fedor", "Programmer", "Petrov@mailbox.com", "892333312", 75000, (byte) 20);
        persArray[2] = new Person("Putin Dimon", "Designer", "Putin@mailbox.com", "894112312", 54000, (byte) 30);
        persArray[3] = new Person("Obama John", "CEO", "Obama@mailbox.com", "892312300", 150000, (byte) 41);
        persArray[4] = new Person("Hanks Mika", "Accountant", "Hanks@mailbox.com", "892312311", 108000, (byte) 31);

        for (Person person: persArray) {
            if (person.getAge() > 40)
                person.printPerson();
        }
    }
}
