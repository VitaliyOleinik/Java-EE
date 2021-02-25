package entities;

public class Users {

    private Long id;
    private String login;
    private String password;
    private String userFullName;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Users(Long id, String login, String password, String userFullName, int age) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.userFullName = userFullName;
        this.age = age;
    }
}