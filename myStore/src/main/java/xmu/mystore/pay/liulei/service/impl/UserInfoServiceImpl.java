package xmu.mystore.pay.liulei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import xmu.mystore.pay.liulei.dao.UserInfoDao;
import xmu.mystore.pay.liulei.model.UserInfo;

public class UserInfoServiceImpl {
	
	@Autowired
	private UserInfoDao userInfoDao;

	public UserInfo getUser(long id){
		return userInfoDao.getUser(id);
	}
}
