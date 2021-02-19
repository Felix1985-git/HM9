package academy.belhard;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаем 3 экземпляра класса Person
        Person user = new Person("Alex", "Ivanov", new Address("Minsk", "Flowers", 38));
        Person user1 = new Person("Evgen", "Petrov", new Address("Tomsk", "Rainbows", 62));
        Person user2 = new Person("Jan", "Wilson", new Address("Brest", "Heroes", 19));

        // Выводим экземпляры класса Person в консоль
        System.out.print(user+""+user1+""+user1+"\n");

        // Создаем коллекцию объетов класса Person
        ArrayList<Person> users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);

        // Записываем в файл "WritePersons" созданные экземпляры класса Person (коллекцию экземпляров класса)
        PersonlOUtil.writePersons(users, "WritePersons");

        // Читаем файл и генерируем коллекцию persons с объектами класса Person (обрабатываем исключение)
        // и выводим колекцию в консаль
        try {
            PersonlOUtil.readPersons("WritePersons").forEach(System.out::print);
        } catch (EmptySourceFileException e) {
            System.err.println(e.getMessage());
        }

    }
}
