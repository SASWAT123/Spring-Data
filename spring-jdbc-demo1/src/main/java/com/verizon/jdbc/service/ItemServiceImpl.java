package com.verizon.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.jdbc.dao.ItemDAO;
import com.verizon.jdbc.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDAO itemDao;

	@Override
	public void addItem(Item item) {
		itemDao.addItem(item);
	}

	@Override
	public void removeItem(int iCode) {
		itemDao.removeItem(iCode);
	}

	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}

	@Override
	public Item getItem(int iCode) {
		return itemDao.getItem(iCode);
	}

	@Override
	public List<Item> getItems() {
		return itemDao.getItems();
	}

	@Override
	public boolean exists(int icode) {
		return itemDao.getItem(icode)!=null;
	}

}
