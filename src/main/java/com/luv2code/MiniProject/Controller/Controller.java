package com.luv2code.MiniProject.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.MiniProject.Models.Faculty;
import com.luv2code.MiniProject.Models.Student;
import com.luv2code.MiniProject.Service.FacultyService;
import com.luv2code.MiniProject.Service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private FacultyService fservice;
	
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
	
	@RequestMapping("/ssave")
	@ResponseBody
	public String save(HttpServletRequest request) {
		Integer num = Integer.parseInt(request.getParameter("enroll"));
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String mob1 = request.getParameter("contact");
		String mob2 = request.getParameter("acontact");
//		String  = request.getParameter("contact");
		System.out.println("Inside Student RequestMapping");
		System.out.println(fname+" "+mname+" "+lname+" "+email+" "+pass+" "+mob1+" "+mob2);
		Student stud = new Student(num,fname,mname,lname,email,pass,mob1,mob2);
		service.save(stud);
		return "Success";
	}
	
	@RequestMapping("/fsave")
	@ResponseBody
	public String fsave(HttpServletRequest request) {
		Integer num = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String mname = request.getParameter("mname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String mob1 = request.getParameter("contact");
		String mob2 = request.getParameter("acontact");
//		String  = request.getParameter("contact");
		System.out.println("Inside Faculty RequestMapping");
		System.out.println(fname+" "+mname+" "+lname+" "+email+" "+pass);
		Faculty faculty = new Faculty(num, fname, mname, lname, email, pass, mob1, mob2);
		fservice.save(faculty);
		return "Success";
	}

}
