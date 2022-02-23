package com.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmsController {
	@GetMapping({"/","/home"})
	public String home()
	{
		return "index" ;
	}

}
