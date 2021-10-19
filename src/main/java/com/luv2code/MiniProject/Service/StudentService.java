package com.luv2code.MiniProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.MiniProject.Models.Student;


@Component
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	
	
	public void save(Student stud) {
		repo.save(stud);
	}
}
