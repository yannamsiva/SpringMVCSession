package com.shiva.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class LoginDaoImpl implements LoginDao {

	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public String login(String uname, String pass) {
		// TODO Auto-generated method stub
		return (String)jt.queryForObject("select type from userdetails where username=\'"+uname+"\'and userpass=\'"+pass+"\'", String.class);
	}

}
