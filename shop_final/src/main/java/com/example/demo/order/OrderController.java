package com.example.demo.order;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.seller.Product;
import com.example.demo.seller.SellerService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService service;

	@Autowired
	private SellerService s_service;
	
	@RequestMapping(value="/order/order")
	public String order(Order o){
		Product p = s_service.getProductByNum(o.getPro_num());
		o.setP(p);
		return "order/orderView";
	}
	
	@RequestMapping(value="/order/order2")
	public String order2(Order o){	
		Product p = s_service.getProductByNum(o.getPro_num());
		if(o.getQuantity()<=p.getQuantity()){
			service.addOrder(o);
			p.setQuantity(p.getQuantity()-o.getQuantity());
			s_service.editProduct(p);
		}
		return "redirect:/order/myOrderList";
	}
	
	@RequestMapping(value="/order/myOrderList")
	public ModelAndView myOrderList(HttpServletRequest req){
		ModelAndView mav = new ModelAndView("order/myOrderList");
		HttpSession session = req.getSession(false);
		String consumer_id = (String)session.getAttribute("id");
		ArrayList<Order> list = 
				(ArrayList<Order>) service.getOrderAll(consumer_id, 1);
		
		for(int i=0;i<list.size();i++){
			Order o = list.get(i);
			o.setP(s_service.getProductByNum(o.getPro_num()));
		}
		mav.addObject("list", list);
		return mav;
	}
}
