package lab_inherit2;

public class FriendsMeeting extends Meeting {
    private final Persons friendList=new Persons();

    public Persons getFriendList() {
        return friendList;
    }

    @Override
    public String toString() {
        return "Встреча с друзьями: \n" + super.toString() + "\n" +
                friendList;
    }
}
