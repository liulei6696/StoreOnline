package xmu.mystore.pay.liulei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xmu.mystore.pay.liulei.model.UserAddress;

public interface UserAddressDao {

	public void add(UserAddress userAddress);

	public void delete(UserAddress userAddress);

	public void update(UserAddress userAddress);

	public UserAddress select(UserAddress userAddress);

	public List<UserAddress> selectAll(@Param("user_id") long user_id);

}
