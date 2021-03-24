package Exercise2_HeadBook;

public class HeadBook {


    public static void main(String[] args) {

        HeadBookUser user1 = new HeadBookUser("heyYOu@youHey.dk","password");
        HeadBookUser user2 = new HeadBookUser("email@email.dk","ThisWord");

        user1.addToFriendList(user2);
        user1.displayAllFriends();
        user1.addToFriendList(user2);
        user1.displayAllFriends();
        user2.addToFriendList(user1);
        user2.displayAllFriends();

        System.out.println(user2.getEmail());
        System.out.println(user2.getPassword());

    }

}
