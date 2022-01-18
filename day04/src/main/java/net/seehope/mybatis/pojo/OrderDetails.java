package net.seehope.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetails implements Serializable {
    private Integer id;
    private Integer orderId;
    private Integer itemsId;
    private Integer itemsInums;
    private Order order;
    private Items items;

}
