package com.lxtyp.basic.order.controller;

import com.lxtyp.basic.order.entity.Order;
import com.lxtyp.basic.order.service.OrderService;
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
  public ResponseEntity<String> orderIn(@RequestBody Order order) {
    logger.debug("/order in orderIn");
    orderService.genOrder(order);
    return ResponseEntity.ok("OK");
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
