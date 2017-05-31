package xmu.mystore.pay.liulei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xmu.mystore.pay.liulei.dao.OrderGoodsDao;
import xmu.mystore.pay.liulei.model.OrderGoods;
import xmu.mystore.pay.liulei.service.OrderGoodsService;

@Service("OrderGoodsService")
public class OrderGoodsServiceImpl implements OrderGoodsService {

	@Autowired
	private OrderGoodsDao orderGoodsDao;

	@Override
	public OrderGoods addAOrderGoods(OrderGoods orderGoods) {
		orderGoodsDao.add(orderGoods);
		return null;
	}

	@Override
	public void deleteAOrderGoods(OrderGoods orderGoods) {
		orderGoodsDao.delete(orderGoods);
	}

	@Override
	public OrderGoods getAOrderGoods(OrderGoods orderGoods) {
		orderGoodsDao.select(orderGoods);
		return null;
	}

}