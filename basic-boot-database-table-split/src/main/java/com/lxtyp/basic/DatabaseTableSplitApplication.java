package com.lxtyp.basic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName BasicApplication
 * @Date 2021/3/15 15:17
 * @Description TODO
 * @Status ISFINISH
 */
@ComponentScan(value = "com.lxtyp")
@MapperScan(value = "com.lxtyp")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DatabaseTableSplitApplication {

  public static void main(String[] args) {
    SpringApplication.run(DatabaseTableSplitApplication.class, args);
  }
}
