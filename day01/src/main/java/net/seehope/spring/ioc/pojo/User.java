package net.seehope.spring.ioc.pojo;

import java.io.Serializable;

public class User implements Serializable {//Serializable接口是启用其序列化功能的接口。实现java.io.Serializable 接口的类是可序列化的。没有实现此接口的类将不能使它们的任意状态被序列化或逆序列化。
    private String username;
    private  String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
