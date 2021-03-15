package com.lxtyp.basic.order.dao;

import com.lxtyp.basic.order.entity.Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(String ORDER_ID);

    int insert(List<Order> list);

    int insertSingle(Order order);

    int updateUserIdByOrder(Order order);

    Order selectByPrimaryKey(String ORDER_ID);

    Order selectByInfo();

    List<Order> selectAll();

    int updateByPrimaryKey(Order record);
}