package seminars.third.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;


    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }


    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }



    //3.6.
    public boolean authenticate(String name, String password, User user) {
        isAuthenticate = name.equals(user.getName()) && password.equals(user.getPassword());
        if (isAuthenticate) {
            return isAuthenticate;
        } else
            return isAuthenticate;
    }

}