package Exercise2_HeadBook;

import java.util.ArrayList;

public class HeadBookUser {

    private String email;
    private String password;
    private ArrayList<HeadBookUser> friendList = new ArrayList<HeadBookUser>();

    public void addToFriendList(HeadBookUser friendToAdd){
        friendList.add(friendToAdd);
        System.out.println(friendToAdd + " is added to your friendlist");

    }

    public void displayAllFriends(){
        for(int i = 0; i<friendList.size(); i++) {

            System.out.println(i + 1 + ": " + friendList.get(i));
        }
    }

    public HeadBookUser(String email, String password){

        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString(){

        return this.email;
    }


}
