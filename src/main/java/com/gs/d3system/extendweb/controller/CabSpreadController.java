package com.gs.d3system.extendweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/3dsystem")
public class CabSpreadController {
	
	@RequestMapping(value="/cabspread")
	public String Index()
	{
		return "index";
	}

}
