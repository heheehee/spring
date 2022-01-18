package net.seehope.mybatis.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable{
    private Integer id;
    private String username;
    private Date birthday;
    private Character sex;
    private String address;
    private String password;
    private String mobile;
    List<Order> orderList;


    public User(Integer id, String username, Date birthday, Character sex, String address, String password, String mobile) {
        this.id = id;
        this.username = username;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.password = password;
        this.mobile = mobile;
    }

}
