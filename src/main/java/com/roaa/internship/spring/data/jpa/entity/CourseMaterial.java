package com.roaa.internship.spring.data.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class CourseMaterial {
	
	@Id
	@SequenceGenerator(
			name="course_material_squence",
			sequenceName = "course_material_squence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="course_material_squence"
	)
	
	private Long courseMaterialId;
	private String url;
	
	@OneToOne
	@JoinColumn(
			name = "course_id",
			referencedColumnName = "courseId"
	)
	private Course course;

}
