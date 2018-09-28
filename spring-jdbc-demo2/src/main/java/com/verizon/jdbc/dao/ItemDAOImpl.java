package com.verizon.jdbc.dao;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.verizon.jdbc.model.Item;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	private NamedParameterJdbcTemplate jtmp;
	
	@Autowired
	private ItemRowMapper rowMapper;	//We need to autowire it so that spring will take care of bean creation and injection
	
	@Autowired
	public ItemDAOImpl(DataSource ds) {
		this.jtmp = new NamedParameterJdbcTemplate(ds);
	}

	@Override
	public void addItem(Item item) {	
		jtmp.update(IQueryMapper.INS_ITEM_QRY,
				new BeanPropertySqlParameterSource(item));
	}

	@Override
	public void removeItem(int iCode) {
		jtmp.update(IQueryMapper.DEL_ITEM_QRY,Collections.singletonMap("iCode", iCode));
	}

	@Override
	public void updateItem(Item item) {
		jtmp.update(IQueryMapper.UPD_ITEM_QRY,
				new BeanPropertySqlParameterSource(item));
	}

	@Override
	public Item getItem(int iCode) {
		List<Item> items = 
				jtmp.query(IQueryMapper.GET_ITEM_QRY,
						Collections.singletonMap("iCode", iCode),
						rowMapper);		//The spring is injecting the row mapper here
		
		return items!=null && items.size()>0?items.get(0):null;
	}

	@Override
	public List<Item> getItems() {
		return jtmp.query(IQueryMapper.GET_ALL_ITEMS_QRY, 
				rowMapper);  //The spring is injecting the row mapper here
	}

}
