package lab_inherit2;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Meeting extends Event{
    public Meeting(LocalDate date, LocalTime time, String place) {
        super(date, time, place);
    }

    public Meeting() {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.place = "home";
    }


}
