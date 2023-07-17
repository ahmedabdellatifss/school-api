package com.roaa.internship.spring.data.jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
public class Teacher {
	
	@Id
	@SequenceGenerator(
			name="Teacher_Squence",
			sequenceName = "Teacher_Squence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="Teacher_Squence"
	)	
	private Long teacherId;
	private String firstName;
	private String lastName;
	
//	@OneToMany(
//			cascade = CascadeType.ALL
//	)
//	@JoinColumn(
//	        name= "teacher_id",
//	        referencedColumnName = "teacherId"
//	)
//	private List<Course> course;

}
