package com.tedu.sp00.service;

import com.tedu.sp00.pojo.User;

public interface UserService {//�û�����
	User getUser(Integer id);//��ȡ�û�
	void addScore(Integer id,Integer score);//��ӷ���
}
