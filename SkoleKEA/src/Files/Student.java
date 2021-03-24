package Files;
public class Student {

    private String mail;
    private String fullName;

    public Student(String mail, String fullName) {
        this.mail = mail;
        this.fullName = fullName;
    }

    public String getMail() {
        return mail;
    }

    public String getFullName() {
        return fullName;
    }

}
