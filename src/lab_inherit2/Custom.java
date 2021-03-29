package lab_inherit2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Custom extends Event{
    public Custom(LocalDate date, LocalTime time, String place) {
        super(date, time, place);
    }

    public Custom() {
    }
}
