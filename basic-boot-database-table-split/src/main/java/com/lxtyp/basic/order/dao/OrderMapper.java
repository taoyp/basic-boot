package com.lxtyp.basic.order.dao;

import com.lxtyp.basic.order.entity.Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(long ORDER_ID);

    int insert(List<Order> list);

    int insertSingle(Order order);

    int updateAddressByUserId(Order order);

    int updateAll(Order order);

    int deleteAll();

    Order selectByPrimaryKey(long ORDER_ID);

    List<Order> selectAll();

    int updateAddressByPrimaryKey(Order order);
}