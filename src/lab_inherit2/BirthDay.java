package lab_inherit2;

import java.time.LocalDate;
import java.time.LocalTime;

public class BirthDay extends Event{
    private Person hero;
    Person[] friendList;

    public BirthDay(LocalDate date, LocalTime time, String place, Person hero) {
        super(date, time, place);
        this.hero = hero;
    }

    public BirthDay() {
    }
}
