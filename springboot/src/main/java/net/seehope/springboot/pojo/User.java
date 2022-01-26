package net.seehope.springboot.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`user`")
public class User implements Serializable {
    @Id
    @Column(name = "`id`")
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "`username`")
    private String username;

    /**
     * 生日
     */
    @Column(name = "`birthday`")
    private Date birthday;

    /**
     * 性别
     */
    @Column(name = "`sex`")
    private String sex;

    /**
     * 地址
     */
    @Column(name = "`address`")
    private String address;

    /**
     * 密码
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 手机号
     */
    @Column(name = "`mobile`")
    private String mobile;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     * @return
     */
    public User setId(Integer id) {
        this.id = id;
        return null;
    }

    /**
     * 获取用户名称
     *
     * @return username - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     * @return
     */
    public User setUsername(String username) {
        this.username = username;
        return null;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     * @return
     */
    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return null;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}