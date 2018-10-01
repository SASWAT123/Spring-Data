package com.verizon.jdbc.dao;

public interface IQueryMapper {
	
	public static final String INS_ITEM_QRY =
			"INSERT INTO items VALUES(?,?,?)";
	public static final String UPD_ITEM_QRY =
			"UPDATE items SET iname=?, iprice=? WHERE icode=?";
	public static final String DEL_ITEM_QRY =
			"DELETE FROM items WHERE icode=?";
	public static final String GET_ITEM_QRY =
			"SELECT * FROM ITEMS WHERE icode=?";
	public static final String GET_ALL_ITEMS_QRY =
			"SELECT * FROM items";

}
