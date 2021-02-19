package academy.belhard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonlOUtil {

// Метод для записи объектов Person в файл
    public static void writePersons(List<Person> users, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person person : users) {
                writer.write(person.getFirstName() + " " +
                        person.getLastName() + " " +
                        person.getAddress().getCity() + " " +
                        person.getAddress().getStreet() + " " +
                        person.getAddress().getHomeNumber() + "\n");
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }
// Чтение из файла и построение объектов класса Person (исключения файл пустой или файла нет)
    public static List<Person> readPersons(String fileName) throws EmptySourceFileException {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String s;
            while ((s = reader.readLine()) != null) {
                String[] dataArray = s.split(" ");
                String firstName = dataArray[0];
                String lastName = dataArray[1];
                String city = dataArray[2];
                String street = dataArray[3];
                int homeNumber = Integer.parseInt(dataArray[4]);
                Person person = new Person(firstName, lastName, new Address(city, street, homeNumber));
                persons.add(person);
            }
            if (persons.size() == 0) {
                throw new EmptySourceFileException("Файл для чтения пуст");
            }
        } catch (FileNotFoundException e) {
            throw new EmptySourceFileException("Файл для чтения не найден");
        } catch (IOException e) {
            e.getMessage();
        }
        return persons;
    }

}
