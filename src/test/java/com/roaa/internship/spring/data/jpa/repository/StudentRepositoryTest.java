package com.roaa.internship.spring.data.jpa.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.roaa.internship.spring.data.jpa.entity.Guardian;
import com.roaa.internship.spring.data.jpa.entity.Student;

import repository.StudentRepository;

@SpringBootTest
public class StudentRepositoryTest {
	
	 @Autowired
	    private StudentRepository studentRepository;

	    @Test
	    public void saveStudent() {
	        Student student = Student.builder()	        		
	                .emailId("ahmed@gmail.com")
	                .firstName("ahmed")
	                .lastName("Mohammed")
//	                .guardianName("Ali")
//	                .guardianEmail("ali@gmail.com")
//	                .guardianMobile("9999999999")
	                .build();

	        studentRepository.save(student);
	    }
	    
	    @Test
	    public void saveStudentWithGuardian() {

	        Guardian guardian = Guardian.builder()
	                .email("ali@gmail.com")
	                .name("ali")
	                .mobile("9999956324")
	                .build();

	        Student student = Student.builder()
	                .firstName("Mohammed")
	                .emailId("mohammed@gmail.com")
	                .lastName("Mostafa")
	                .guardian(guardian)
	                .build();

	        studentRepository.save(student);

	    }
	    
	    @Test
	    public void printAllStudent() {
	    	List<Student> studentList = studentRepository.findAll();
	    	
	    	System.out.println("StudentList = " + studentList);
	    }
	    
	    @Test
	    public void printStudentByFirstName() {
	        
	        List<Student> students =
	                studentRepository.findByFirstName("ahmed");

	        System.out.println("students = " + students);
	    }
	    
	    @Test
	    public void printStudentByFirstNameContaining() {

	        List<Student> students =
	                studentRepository.findByFirstNameContaining("ah");

	        System.out.println("students = " + students);
	    }

	    @Test
	    public void printStudentBasedOnGuardianName(){
	        List<Student> students =
	                studentRepository.findByGuardianName("ali");
	        System.out.println("students = " + students);
	    }
	    
	    
	    @Test
	    public void printgetStudentByEmailAddress() {
	        Student student =
	                studentRepository.getStudentByEmailAddress(
	                        "ahmed@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }

	    
	    @Test
	    public void printgetStudentFirstNameByEmailAddress() {
	        String firstName =
	                studentRepository.getStudentFirstNameByEmailAddress(
	                        "ahmed@gmail.com"
	                );
	        System.out.println("firstName = " + firstName);
	    }
	    
	    @Test
	    public void printgetStudentByEmailAddressNative(){
	        Student student =
	                studentRepository.getStudentByEmailAddressNative(
	                        "ahmed@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }
	    
	    @Test
	    public void printgetStudentByEmailAddressNativeNamedParam() {
	        Student student =
	                studentRepository.getStudentByEmailAddressNativeNamedParam(
	                        "ahmed@gmail.com"
	                );

	        System.out.println("student = " + student);
	    }
	    
	    
	    @Test
	    public void updateStudentNameByEmailIdTest() {
	        studentRepository.updateStudentNameByEmailId(
	                "Ahmed Mohammmed",
	                "ahmed@gmail.com");
	    }
	    
	    
}
