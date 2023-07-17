package com.roaa.internship.spring.data.jpa.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.roaa.internship.spring.data.jpa.entity.Course;
import com.roaa.internship.spring.data.jpa.entity.Teacher;
import com.roaa.internship.spring.data.jpa.entity.TeacherRepository;

@SpringBootTest
public class TeacherRepositoryTest {

	
	  @Autowired
	    private TeacherRepository teacherRepository;

	    @Test
	    public void saveTeacher() {

	        Course courseDBA = Course.builder()
	                .title("DBA")
	                .credit(5)
	                .build();

	        Course courseJava = Course.builder()
	                .title("Java")
	                .credit(6)
	                .build();

	        Teacher teacher =
	                Teacher.builder()
	                        .firstName("Ahmed")
	                        .lastName("Mohammed")
	                        //.courses(List.of(courseDBA,courseJava))
	                        .build();

	        teacherRepository.save(teacher);
	    }
}
