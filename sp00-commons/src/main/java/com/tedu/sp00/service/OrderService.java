package com.tedu.sp00.service;

import com.tedu.sp00.pojo.Order;

public interface OrderService {//��������
	Order getOrder(String orderId);//��ȡ����
	void addOrder(Order order);//��Ӷ���
}
