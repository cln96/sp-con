package com.tedu.sp00.service;

import java.util.List;

import com.tedu.sp00.pojo.Item;

public interface ItemService {//使用接口是为了实现类的耦合性
	List<Item> getItems(String orderId);//得到项目
	void decreaseNumbers(List<Item> list);//减少数量
}
