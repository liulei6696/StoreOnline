package xmu.mystore.pay.liulei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xmu.mystore.pay.liulei.service.OrderInfoService;
import xmu.mystore.pay.liulei.service.UserInfoService;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	
	@Autowired
	private UserInfoService UserInfoService;
	
	@Autowired
	private OrderInfoService orderInfoService;
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String home(Model model) {
		
		//model.addAttribute("consignee", UserInfoService.getUSer(2));
		//model.addAttribute("order", orderInfoService.getOrderInfo(2));
		return "/liulei/submitOrder";
	}
	
	
	@RequestMapping(value="/liulei/submitOrder",method=RequestMethod.POST)
	public String asljfksd (@ModelAttribute("sm")long id){
		//将获取到的订单ID的状态改为未支付
		//orderInfoService.getOrderInfo(id).setOrder_status(0);
		return "/liulei/payOrder";
	}
}
