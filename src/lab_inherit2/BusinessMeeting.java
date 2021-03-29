package lab_inherit2;

import java.time.LocalDate;
import java.time.LocalTime;

public class BusinessMeeting extends Meeting {
   private final Persons partnerList = new Persons();
   private String meetingResult;
   private String meetingTheme;
   private String [] questionList;

    public BusinessMeeting(LocalDate date, LocalTime time, String place, String meetingResult, String meetingTheme, String[] questionList) {
        super(date, time, place);
        this.meetingResult = meetingResult;
        this.meetingTheme = meetingTheme;
        this.questionList = questionList;
    }

    public Persons getPartnerList() {
        return partnerList;
    }

    public String getMeetingResult() {
        return meetingResult;
    }

    public void setMeetingResult(String meetingResult) {
        this.meetingResult = meetingResult;
    }

    public String getMeetingTheme() {
        return meetingTheme;
    }

    public void setMeetingTheme(String meetingTheme) {
        this.meetingTheme = meetingTheme;
    }

    public String[] getQuestionList() {
        return questionList;
    }

    public void setQuestionList(String[] questionList) {
        this.questionList = questionList;
    }
}
