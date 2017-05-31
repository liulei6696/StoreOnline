package xmu.mystore.pay.liulei.dao;

import java.util.List;

import xmu.mystore.pay.liulei.model.OrderInfo;

public interface OrderInfoDao {

	public void add(OrderInfo orderInfo);

	public void delete(OrderInfo orderInfo);

	public void update(OrderInfo orderInfo);

	public OrderInfo select(OrderInfo orderInfo);

	public List<OrderInfo> selectAll();

	public OrderInfo getOrderInfo(long id);
}
