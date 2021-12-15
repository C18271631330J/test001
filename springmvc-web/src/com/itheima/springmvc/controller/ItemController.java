package com.itheima.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.pojo.QueryVo;
import com.itheima.springmvc.service.ItemService;

import java.util.List;

/**
 * 商品处理Controller
 * <p>Title: ItemController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class ItemController {
	//test Github 提交代码
	//test Github 第二次提交代码
	//test Github 第三次提交代码
	//git 提交015
	//git 提交016
	//git 提交017
	//git 提交018
	//git 提交020
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/itemList")
	public ModelAndView getItemList() {
		//查询商品列表
		List<Items> itemList = itemService.getItemList();
		//把结果传递给页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", itemList);
		//设置逻辑视图
		modelAndView.setViewName("itemList");
		//返回结果
		return modelAndView;
	}
	
	/*@RequestMapping("/itemEdit")
	public String editItem(HttpServletRequest request, 
			HttpServletResponse response, HttpSession session, Model model) {
		//从request中取参数
		String strId = request.getParameter("id");
		int id = new Integer(strId);
		//调用服务
		Items items = itemService.getItemById(id);
		//把结果传递给页面
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("item", items);
		//设置逻辑视图
		//modelAndView.setViewName("editItem");
		//return modelAndView;
		//设置返回结果
		model.addAttribute("item", items);
		//返回逻辑视图
		return "editItem";
	}
	*/
	@RequestMapping("/itemEdit")
	public String editItem(@RequestParam(value="id",defaultValue="1",required=true)Integer ids, Model model) {
		Items items = itemService.getItemById(ids);
		//把数据传递给页面
		model.addAttribute("item", items);
		//返回逻辑视图
		return "editItem";
	}
	
	@RequestMapping("/updateitem")
	public String updateItem(Items items) {
		itemService.updateItem(items);
		//返回成功页面
		return "success";
	}
	
	@RequestMapping("/queryitem")
	public String queryItem(QueryVo queryVo) {
		//打印绑定结果
		System.out.println("chenjie001");
		System.out.println(queryVo.getItems().getName());
		
		return "success";
	}


}

