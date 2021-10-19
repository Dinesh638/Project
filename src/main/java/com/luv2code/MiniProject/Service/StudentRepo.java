package com.luv2code.MiniProject.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luv2code.MiniProject.Models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
