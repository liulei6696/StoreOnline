package xmu.mystore.pay.liulei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.mystore.pay.liulei.dao.UserAddressDao;
import xmu.mystore.pay.liulei.model.UserAddress;
import xmu.mystore.pay.liulei.service.UserAddressService;

@Service("UserAddressService")
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	private UserAddressDao userAddressDao;

	@Override
	public void addAUserAddress(UserAddress userAddress) {
		userAddressDao.add(userAddress);
	}

	@Override
	public void modifyUserAddress(UserAddress userAddress) {
		userAddressDao.update(userAddress);
	}

}