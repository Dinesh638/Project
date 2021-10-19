package com.luv2code.MiniProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luv2code.MiniProject.Models.Faculty;
import com.luv2code.MiniProject.Models.Student;

@Component
public class FacultyService {
	
	@Autowired
	private FacultyRepo repo;
	
	public void save(Faculty faculty) {
		repo.save(faculty);
	}
}
