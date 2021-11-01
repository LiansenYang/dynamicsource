package com.yangls.dynamicsource.controller;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.yangls.dynamicsource.entity.Order;
import com.yangls.dynamicsource.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Yangls
 * @since 2021-10-30
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("createOrder")
    public String createOrder(Order order) {
        orderService.save(order);
        return "success";
    }

    @PostMapping("createOrderError")
    @Transactional
    public String createOrderError(Order order) {
        orderService.save(order);
        order.setId(order.getId() + 1);
        orderService.save(order);
        int i = 1 / 0;
        return "success";
    }

    //指定数据库
    @PostMapping("createOrderSpecific")
    @DS("master0")
    public String createOrderSpecific(Order order) {
        orderService.save(order);
        return "success";
    }

    //mybatis-plus 使用sharding-jdbc的分库分表配置
    @PostMapping("createOrderSharding")
    @DS("master0")
    public String createOrderSharding(Order order) {
        orderService.save(order);
        return "success";
    }

}

