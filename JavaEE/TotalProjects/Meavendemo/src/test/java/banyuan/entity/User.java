package banyuan.entity;

public class User {
    private int id;
    private String userName;
    private String userPassword;
    private String userSmallName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserSmallName() {
        return userSmallName;
    }

    public void setUserSmallName(String userSmallName) {
        this.userSmallName = userSmallName;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userSmallName='" + userSmallName + '\'' +
                '}';
    }
}
