package com.tedu.sp00.service;

import java.util.List;

import com.tedu.sp00.pojo.Item;

public interface ItemService {//ʹ�ýӿ���Ϊ��ʵ����������
	List<Item> getItems(String orderId);//�õ���Ŀ
	void decreaseNumbers(List<Item> list);//��������
}
