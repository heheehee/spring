package net.seehope.mybatis.mapper;

import net.seehope.mybatis.pojo.Order;

public interface OrderMapper {
    Order getOrderByUserId(int id);
}
