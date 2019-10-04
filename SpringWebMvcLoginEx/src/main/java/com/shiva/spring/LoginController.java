package com.shiva.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.shiva.spring.dao.LoginDaoImpl;

public class LoginController implements Controller {

	private LoginDaoImpl lm;
	
	public LoginController(LoginDaoImpl lm) {
		super();
		this.lm = lm;
	}

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		String type=lm.login(uname, pass);
		
		if(type==null)
			return new ModelAndView("/index.jsp");
		else if(type.equals("admin"))
			return new ModelAndView("/AdminHome.jsp");
		else
		return new ModelAndView("/UserHome.jsp");
	}

}
