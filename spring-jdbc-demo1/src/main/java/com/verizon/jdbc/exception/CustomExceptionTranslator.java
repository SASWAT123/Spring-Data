package com.verizon.jdbc.exception;

import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.support.SQLExceptionTranslator;
import org.springframework.stereotype.Component;

@Component("customExceptionTranslator")
public class CustomExceptionTranslator implements SQLExceptionTranslator{

	//We are converting the SQL Exception into DataAccess Exception
	
	@SuppressWarnings("serial")
	@Override
	public DataAccessException translate(String task, String sql, 
			SQLException exception) {
		return new DataAccessException(exception.toString()) {
		};
	}
	
		

}
