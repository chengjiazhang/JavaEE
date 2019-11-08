package com.banyuan.pangu.domain.dos;


/**
 * @author edz
 */

public class User {
    private Integer id;
    private String userName;
    private String userPassword;
    private  String userSmallName;
    private String phoneNum;
    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getUserSmallName() {
        return userSmallName;
    }

    public void setUserSmallName(String userSmallName) {
        this.userSmallName = userSmallName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
