package com.itheima.springmvc.service;

import java.util.List;

import com.itheima.springmvc.pojo.Items;

public interface ItemService {

	List<Items> getItemList();
	Items getItemById(int id);
	void updateItem(Items items);
}
