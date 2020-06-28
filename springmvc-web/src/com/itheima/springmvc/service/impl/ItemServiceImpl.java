package com.itheima.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.springmvc.mapper.ItemsMapper;
import com.itheima.springmvc.pojo.Items;
import com.itheima.springmvc.pojo.ItemsExample;
import com.itheima.springmvc.service.ItemService;

/**
 * 商品管理Service
 * <p>Title: ItemServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemsMapper itemsMapper;
	
	@Override
	public List<Items> getItemList() {
		ItemsExample example = new ItemsExample();
		List<Items> list = itemsMapper.selectByExampleWithBLOBs(example);
		return list;
	}

	@Override
	public Items getItemById(int id) {
		//根据商品id查询商品信息
		Items items = itemsMapper.selectByPrimaryKey(id);
		return items;
	}

	@Override
	public void updateItem(Items items) {
		
		itemsMapper.updateByPrimaryKeySelective(items);
		
	}

}
