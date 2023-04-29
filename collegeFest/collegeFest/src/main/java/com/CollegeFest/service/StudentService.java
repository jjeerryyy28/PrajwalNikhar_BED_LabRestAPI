package com.CollegeFest.service;

import java.util.List;

import com.CollegeFest.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(long id);

	public void save(Student theStudent);

	public void deleteById(long id);

}
