package com.lxtyp.basic.order.service;

import com.lxtyp.basic.order.dao.OrderMapper;
import com.lxtyp.basic.order.entity.Order;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderService
 * @Date 2021/3/15 16:24
 * @Description TODO
 * @Status ISFINISH
 */
@Service
public class OrderService {
  @Autowired
  private OrderMapper orderMapper;

  public void genOrder() {
    BigDecimal bigDecimal = new BigDecimal(10);
    Date date = new Date();
    List<Order> list = new ArrayList<>();
    for (long i = 0; i < 10; i++) {
      Order order = new Order();
      order.setOrderId(i);
      order.setOrderAddress("in Xian Now");
      order.setOrderPrice(bigDecimal);
      order.setOrderPay(bigDecimal);
      order.setOrderDiscount(bigDecimal);
      order.setStatus("0");
      order.setUserId((long)(Math.random()*1000000L));
      order.setPayType("0");
      order.setCreateTime(date);
      order.setUpdateTime(date);

      list.add(order);
    }
    orderMapper.insert(list);
  }

  public void orderInSingle(Order order) {
    orderMapper.insertSingle(order);
  }

  public Order getOrderInfo(String orderId) {
    return orderMapper.selectByPrimaryKey(orderId);
  }

  public List<Order> getOrderList() {
    return orderMapper.selectAll();
  }

  public int updateAddress(Order order) {
    return orderMapper.updateAddressByPrimaryKey(order);
  }

  public int updateAll(Order order) {
    return orderMapper.updateAll(order);
  }

  public int deleteOrder(String orderId) {
    return orderMapper.deleteByPrimaryKey(orderId);
  }

  public int deleteAll() {
    return orderMapper.deleteAll();
  }

}
