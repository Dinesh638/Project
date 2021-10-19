package com.luv2code.MiniProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/reg")
	public String reg() {
		return "signup";
	}
	
	@RequestMapping("/sreg")
	public String stud() {
		return "stud_reg";
	}
	
	@RequestMapping("/freg")
	public String faculty() {
		return "faculty_reg";
	}

}
