package com.verizon.jdbc.dao;

public interface IQueryMapper {
	
	//:iCode -> This syntax is used and it is called Named Parameters JDBC Template
	
	public static final String INS_ITEM_QRY =
			"INSERT INTO items VALUES(:iCode, :iName, :iPrice)";
	public static final String UPD_ITEM_QRY =
			"UPDATE items SET iname=:iName, iprice=:iPrice WHERE icode=:iCode";
	public static final String DEL_ITEM_QRY =
			"DELETE FROM items WHERE icode=:iCode";
	public static final String GET_ITEM_QRY =
			"SELECT * FROM ITEMS WHERE icode=:iCode";
	public static final String GET_ALL_ITEMS_QRY =
			"SELECT * FROM items";

}
