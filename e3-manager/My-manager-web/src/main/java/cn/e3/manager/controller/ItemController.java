package cn.e3.manager.controller;

import org.junit.experimental.theories.ParametersSuppliedBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.domain.TbItem;
import cn.e3.manager.service.ItemService;

@Controller
public class ItemController {

		//注入service 对象
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/id/{itemId}")
	@ResponseBody
	public TbItem findItemByID(@PathVariable Long itemID){
		return itemService.findIntemByID(itemID);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
