package cn.mybatis.mydemo.domain.DO;

/**
 * @author: ZCJ
 * @Date: 2019-11-03 16:42
 * @Description:
 */
public class User {
    private int id;
    private String userName;
    private String userPassword;
    private String userSmallname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserSmallname() {
        return userSmallname;
    }

    public void setUserSmallname(String userSmallname) {
        this.userSmallname = userSmallname;
    }
}
