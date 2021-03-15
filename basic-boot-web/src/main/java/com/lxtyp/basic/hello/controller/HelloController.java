package com.lxtyp.basic.hello.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Date 2021/3/15 15:21
 * @Description TODO
 * @Status ISFINISH
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

  @RequestMapping(value = "/hi")
  public String sayHi() {
    return "hi";
  }
}
