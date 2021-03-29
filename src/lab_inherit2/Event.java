package lab_inherit2;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Event {
    LocalDate date;
    LocalTime time;
    String place;

    public Event(LocalDate date, LocalTime time, String place) {
        this.date = date;
        this.time = time;
        this.place = place;
    }

    public Event() {
        this.date = LocalDate.now();
        this.time = LocalTime.now();
        this.place = "unknown";
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return String.format("Дата и время %s T %s, Место - %s ", date, time, place);
    }
}
