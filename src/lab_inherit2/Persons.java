package lab_inherit2;

import java.time.LocalDate;
import java.util.Arrays;

public class Persons {
    private Person[] persons={
            new Person("Иванов", "Иван","Иванович", LocalDate.of(2002, 3, 8),"543523", "1@mail.ru", Person.GENDER_MALE),
            new Person("Петров", "Петр","Петрович", LocalDate.of(2000, 8, 23),"333333", "2@mail.ru", Person.GENDER_MALE),
            new Person("Сидоров", "Игорь","Иванович", LocalDate.of(1998, 4, 16),"555555", "3@mail.ru", Person.GENDER_MALE),
            new Person("Лукманов", "Олег","Николаевич", LocalDate.of(1996, 7, 18),"444553", "4@mail.ru", Person.GENDER_MALE),
            new Person("Иванова", "Галина","Юрьевна", LocalDate.of(2000, 9, 25),"454353", "5@mail.ru", Person.GENDER_FEMALE)
    };

    public void addPerson(Person person){
        Person[] copy = Arrays.copyOf(this.persons,this.persons.length+1);
        copy[copy.length-1] = person;
        this.persons = copy;
    }
    public void printAll(){
        for (Person person: this.persons ) {
            System.out.println(person);
        }
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public int findPersonBySurname(String surname){
        for (int i = 0; i < this.persons.length; i++) {
            if (this.persons[i].getSurname().equals(surname)) return i;
        }
        return -1;
    }

    public void sortPersons(int kriteri){
        /*
        * kriteri = 1 , сортировка по фамилии
        * kriteri = 2 , сортировка по имени
        * по умолчанию , сортировка по дате рождения
        * */
        Arrays.sort(this.persons, (o1, o2) -> switch (kriteri) {
            case 1 -> o1.getSurname().compareTo(o2.getSurname());
            case 2 -> o1.getFName().compareTo(o2.getFName());
            default -> o1.getBirthday().compareTo(o2.getBirthday());
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список участников: \n");
        for (Person person: this.persons
             ) {
            sb.append("\t").append(person.toString()).append("\n");
        }
        return sb.toString();
    }
}
