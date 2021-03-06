package com.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendance.entity.Student;
import com.attendance.repository.StudentRepository;

// Java annotation that defines the class as a Service
@Service

public class StudentServiceImp implements IStudentService{

	// Import Student Repository by using the @Autowired
	@Autowired
	private StudentRepository studentRepository;

	// Method listAll() to return a list of Students
	@Override
	public List<Student> listAll() {	
		return (List<Student>)studentRepository.findAll();
	}

	// Method save() that saves a Student in mySql server
	@Override
	public void save(Student student) {
		studentRepository.save(student);	
	}

	// Method buscarPorId() that search in the server by Id of the Student
	@Override
	public Student searchById(Long id) {
		return studentRepository.findById(id).orElse(null);
	}

	// Method delete() that deletes a row in the mySql server searching by Id
	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);	
	}
	
}
