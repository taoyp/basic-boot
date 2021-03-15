package com.lxtyp.basic.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order implements Serializable {
    private long orderId;

    private long userId;

    private String status;

    private BigDecimal orderPrice;

    private String payType;

    private String orderAddress;

    private BigDecimal orderDiscount;

    private BigDecimal orderPay;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}