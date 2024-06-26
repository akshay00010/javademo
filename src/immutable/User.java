package immutable;

public class User
{

    private String userName;
    private String email;
    private String password;
    private String role;
    private boolean active;

    public User(String userName, String email, String password, String role, boolean active) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public User(String userName,String email,String password){
        this(userName,email,password,"developer",true);}
     public User(String userName,String email,String password,String role){
    }

}
