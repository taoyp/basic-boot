package com.lxtyp.basic.order.service;

import com.lxtyp.basic.order.dao.OrderMapper;
import com.lxtyp.basic.order.entity.Order;
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

  public void genOrder(Order order) {
    orderMapper.insertSingle(order);
  }
}
