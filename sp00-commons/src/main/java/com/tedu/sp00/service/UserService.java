package com.tedu.sp00.service;

import com.tedu.sp00.pojo.User;

public interface UserService {//用户服务
	User getUser(Integer id);//获取用户
	void addScore(Integer id,Integer score);//添加分数
}
