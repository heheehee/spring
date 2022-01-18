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
public class Order implements Serializable {
    Integer id;
    Integer userId;
    String number;
    Date createtime;
    String note;
   private User user;
   private List<OrderDetails> orderDetailsList;
}
