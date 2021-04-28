package Exceptions.opgaver;

public class NemIdUser {
    private String username;
    private String password;

    public NemIdUser(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
