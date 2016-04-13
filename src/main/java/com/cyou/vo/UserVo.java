package com.cyou.vo;

/**
 * 类UserVo.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月21日 下午5:50:11
 */
public class UserVo extends Vo {

    private static final long serialVersionUID = 3756619588250931410L;
    private int userId;
    private String userName;
    private String email;
    private String phone;
    private String address;
    private int age;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
