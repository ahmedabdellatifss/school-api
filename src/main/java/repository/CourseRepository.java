package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roaa.internship.spring.data.jpa.entity.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
