package xmu.mystore.pay.liulei.service;

import xmu.mystore.pay.liulei.model.OrderGoods;

public interface OrderGoodsService {
	
	public OrderGoods addAOrderGoods(OrderGoods orderGoods);
	
	public void deleteAOrderGoods(OrderGoods orderGoods);
	
	public OrderGoods getAOrderGoods(OrderGoods orderGoods);

}
