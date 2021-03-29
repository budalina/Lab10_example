package recordcountry;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
//создаем экземпляр класса для работы с массивом стран
        RecordCountry rc = new RecordCountry();

        cycle: while (true) {
            System.out.println("1. Заполнить массив");
            System.out.println("2. Распечатать");
            System.out.println("3. Найти страны с площадью больше средней");
            System.out.println("4. Найти страну с максимальной площадью");
            System.out.println("5. Упорядочить страны по численности населения");
            System.out.println("6. Упорядочить страны по названиям");
            System.out.println("7. Выход");
            System.out.println("Выберете пункт меню (1..7)");
            int c = (new Scanner(System.in)).nextInt();
            switch (c) {
                case 1: rc.fillCountry(); break;
                case 2: rc.printCountry(); break;
                case 3: rc.countriesBiggerThanAvgSquareList(); break;
                case 4: rc.maxSquareCountry(); break;
                case 5: rc.sortByPopulation(); break;
                case 6: rc.sortByName(); break;
                default: break cycle;
            }
        }
    }

}
