package com.shiva.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellowController {
@RequestMapping("/first")
	public String sayHello()
	{
//from here we can interact with model component...	
		return "welcome.jsp";//view
	}
}
