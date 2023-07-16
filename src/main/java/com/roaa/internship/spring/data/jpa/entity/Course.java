package com.roaa.internship.spring.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Course {

	@Id
	@SequenceGenerator(
			name="Course_Squence",
			sequenceName = "Course_Squence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="Course_Squence"
	)	
	private Long courseId;
	private String title;
	private Integer credit;
	
	
}
