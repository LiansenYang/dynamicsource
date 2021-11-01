package com.yangls.dynamicsource.service.impl;

import com.yangls.dynamicsource.entity.Order;
import com.yangls.dynamicsource.mapper.OrderMapper;
import com.yangls.dynamicsource.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yangls
 * @since 2021-10-30
 */
@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
