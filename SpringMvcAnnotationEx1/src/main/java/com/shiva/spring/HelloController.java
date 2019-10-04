package com.shiva.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display(@RequestParam("name")String name,@RequestParam("pass")String pass,Model m)
	{
		if(pass.equals("admin"))
		{
			String msg="Hello"+name;
			//add a message to the model
			m.addAttribute("message",msg);
			return "viewpage.jsp";
		}
		else
		{
		String msg="Sorry"+name+"You entered Invalid Password";
		m.addAttribute("message",msg);
		return "errorpage.jsp";
		}

		
	}
	
/*	@RequestMapping("/hello")
	public String display(HttpServletRequest req,Model m)
	{
		//read the data provided form data
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(pass.equals("admin"))
		{
			String msg="Hello"+name;
			//add a message to the model
			m.addAttribute("message",msg);
			return "viewpage.jsp";
		}
		else
		{
		String msg="Sorry"+name+"You entered Invalid Password";
		m.addAttribute("message",msg);
		return "errorpage.jsp";
		}

		
	}
*/
	

}
