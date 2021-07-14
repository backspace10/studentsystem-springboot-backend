package net.mypack.springboot.service;

import java.util.List;

import net.mypack.springboot.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();
}