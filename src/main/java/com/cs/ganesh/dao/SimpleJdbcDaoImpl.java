package com.cs.ganesh.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class SimpleJdbcDaoImpl extends JdbcDaoSupport{
	
	public int getCircleCount() {
		String sql = "SELECT COUNT(*) FROM circle";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

}
