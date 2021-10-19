package com.luv2code.MiniProject.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.MiniProject.Models.Faculty;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Integer>{

}
