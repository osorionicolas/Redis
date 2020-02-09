package com.nosorio.redis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nosorio.redis.models.Student;
import com.nosorio.redis.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public void saveStudent(String id) {
	    Student student = new Student(id, "John Doe", Student.Gender.MALE, 1);
	    studentRepository.save(student);
	}
	
	public void getStudent(String id) {
	    Student retrievedStudent = studentRepository.findById(id).get();
	    System.out.println(retrievedStudent.getId());
	}
}
