package repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.roaa.internship.spring.data.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
