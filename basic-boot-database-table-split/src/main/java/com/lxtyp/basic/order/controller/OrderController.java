package com.lxtyp.basic.order.controller;

import com.lxtyp.basic.order.entity.Order;
import com.lxtyp.basic.order.service.OrderService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Date 2021/3/15 16:21
 * @Description TODO
 * @Status ISFINISH
 */
@RestController
@RequestMapping(value = "/order")
public class OrderController {
  private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

  @Autowired
  private OrderService orderService;

  @RequestMapping(value = "/in")
  public ResponseEntity<String> orderIn() {
    logger.debug("/order in orderIn");
    orderService.genOrder();
    return ResponseEntity.ok("OK");
  }

  @RequestMapping(value = "/single")
  public ResponseEntity<String> orderInSingle(@RequestBody Order order) {
    orderService.orderInSingle(order);
    return ResponseEntity.ok("OK");
  }

  @RequestMapping(value = "/one")
  public ResponseEntity<String> orderOne(String orderId) {
    orderService.getOrderInfo(orderId);
    return ResponseEntity.ok("OK");
  }

  @RequestMapping(value = "/list")
  public List<Order> orderList(String orderId) {
    return orderService.getOrderList();
  }

  @RequestMapping(value = "/update")
  public ResponseEntity<String> updateAddress(Order order) {
    int i = orderService.updateAddress(order);
    String retInfo = i > 0 ? "OK" : "fail";
    return ResponseEntity.ok(retInfo);
  }

  @RequestMapping(value = "/delete")
  public ResponseEntity<String> deleteOrder(String orderId) {
    int i = orderService.deleteOrder(orderId);
    String retInfo = i > 0 ? "OK" : "fail";
    return ResponseEntity.ok(retInfo);
  }

  @RequestMapping(value = "/update/all")
  public ResponseEntity<String> updateAddressAll(@RequestBody Order order) {
    int i = orderService.updateAll(order);
    String retInfo = i > 0 ? "OK" : "fail";
    return ResponseEntity.ok(retInfo);
  }

  @RequestMapping(value = "/delete/all")
  public ResponseEntity<String> deleteOrderAll() {
    int i = orderService.deleteAll();
    String retInfo = i > 0 ? "OK" : "fail";
    return ResponseEntity.ok(retInfo);
  }

  @RequestMapping(value = "/hi")
  public String sayHi() {
    logger.debug("/order in sayHi");
    System.out.println(1111);
    logger.info("12345");
    logger.error("34567");
    return "hi";
  }
}
