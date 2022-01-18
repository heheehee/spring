package net.seehope.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Items implements Serializable {
    Integer id;
    String name;
    Float price;
    String detail;
    String pic;
    Date createtime;

}
