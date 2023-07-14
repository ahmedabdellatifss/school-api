package com.roaa.internship.spring.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.roaa.internship.spring.data.jpa.entity.Student;

import repository.StudentRepository;

@SpringBootTest
public class StudentRepositoryTest {
	
	 @Autowired
	    private StudentRepository studentRepository;

	    @Test
	    public void saveStudent() {
	        Student student = Student.
	        		
	        		
//	                .emailId("shabbir@gmail.com")
//	                .firstName("Shabbir")
//	                .lastName("Dawoodi")
//	                .guardianName("Nikhil")
//	                .guardianEmail("nikhil@gmail.com")
//	                .guardianMobile("9999999999")
//	                .build();

	        studentRepository.save(student);
	    }

}
