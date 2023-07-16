package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.roaa.internship.spring.data.jpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	 List<Student> findByFirstName(String firstName);
	
	 List<Student> findByFirstNameContaining(String name);
	 
	 List<Student> findByLastNameNotNull();
	 
	 List<Student> findByGuardianName(String guardianName);
	 
	 Student findByFirstNameAndLastName(String firstName, String lastName);
	 
	 //JPQL
	 @Query("select s from Student s where s.emailId = ?1")
	 Student getStudentByEmailAddress(String EmailId);
	 
	 
	//JPQL
	@Query("select s.firstNmae from Student s where s.emailId = ?1")
	String getStudentFirstNameByEmailAddress(String emailId);
	
	
	// Native Query 
	@Query(
			value="SELECT* FROM tbl_student s where s.email_adddress = ?1",
			nativeQuery=true
	)
	Student getStudentByEmailAddressNative(String emailId);
	
	
	// Native Named Param
	@Query(
		value="SELECT* FROM tbl_student s where s.email_adddress = :emailId",
		nativeQuery=true
	)
	Student getStudentByEmailAddressNativeNamedParam(@Param("emailId") String emailId);
	
	
	@Modifying
	@Transactional
	@Query(
	
			value="update tbl_student set first-name = ?1 where email_address = ?2",
			nativeQuery = true
	)
	int updateStudentNameByEmailId(String firstName, String emailId);
	
	
	
}
