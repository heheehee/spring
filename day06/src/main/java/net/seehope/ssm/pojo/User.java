package net.seehope.ssm.pojo;
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
}
