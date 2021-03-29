package lab_inherit2;

import java.time.LocalDate;
import java.util.Arrays;

public class Temp {
//   public static boolean f(int x, int y, int A){
//       // return (y+4*x<A||x+4*y>120||5*x-2*y>50);
//       // return 2*y+4*x<A||x+2*y>80;
//
//        return (y-x<A || x+4*y>40||y-2*x<-35);
//    }
//
//    public static int aMin(int xMin, int yMin){
//        boolean resExists = false;
//        int aFloor = -100;
//        while (!resExists) {
//            for (int A = aFloor; A <= aFloor+100; A++) {
//                boolean OK = true;
//                for (int x = xMin; x < 1000; x++) {
//                    for (int y = yMin; y < 1000; y++) {
//                        if (!f(x, y, A)) {
//                            OK = false;
//                             break;
//                        }
//                    }
//                }
//                if (OK) {
//                    resExists = true;
//                    return A;
//                }
//            }
//            aFloor+=100;
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        FriendsMeeting meeting = new FriendsMeeting();
        Person person = new Person("Покрова", "Анна","Федоровна", LocalDate.of(1996, 12, 15),"222222", "6@mail.ru", Person.GENDER_FEMALE);
        meeting.getFriendList().addPerson(person);
        meeting.getFriendList().sortPersons(2);
        System.out.println(meeting);
      //  System.out.println(aMin(1,1));
    }
}
