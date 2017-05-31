package xmu.mystore.pay.liulei.dao;

import xmu.mystore.pay.liulei.model.OrderGoods;

public interface OrderGoodsDao {

	public void add(OrderGoods orderGoods);

	public void delete(OrderGoods orderGoods);

	public OrderGoods select(OrderGoods orderGoods);

}
