package com.tedu.sp00.service;

import com.tedu.sp00.pojo.Order;

public interface OrderService {//订单服务
	Order getOrder(String orderId);//获取订单
	void addOrder(Order order);//添加订单
}
