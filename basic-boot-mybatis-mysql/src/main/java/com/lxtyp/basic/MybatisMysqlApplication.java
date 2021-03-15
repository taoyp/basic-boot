package com.lxtyp.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @ClassName BasicApplication
 * @Date 2021/3/15 15:17
 * @Description TODO
 * @Status ISFINISH
 */
@SpringBootApplication
@ComponentScan(value = "com.lxtyp")
public class MybatisMysqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(MybatisMysqlApplication.class, args);
  }
}
