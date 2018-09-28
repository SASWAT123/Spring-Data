package com.verizon.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.verizon.jdbc.model.Item;

@Component
public class ItemRowMapper implements RowMapper<Item> {

	@Override
	public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
		Item item = new Item();
		
		item.setiCode(rs.getInt(1));
		item.setiName(rs.getString(2));
		item.setiPrice(rs.getDouble(3));
		
		return item;
	}

}
