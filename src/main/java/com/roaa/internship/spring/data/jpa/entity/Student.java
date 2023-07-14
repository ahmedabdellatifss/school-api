package com.roaa.internship.spring.data.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor; 


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder 
@Table(
		name="tbl_student",
		uniqueConstraints = @UniqueConstraint(
				name = "emailid_unique",
				columnNames = "email_address"
		)
)
public class Student {
	
	@Id 
	@SequenceGenerator(
			name="student_sequence",
			sequenceName ="student_sequence",
			allocationSize = 1
	)
	@GeneratedValue(		
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(
			name="email_address",
			nullable= false
	)
	private String emailId;
	
	private String guardianName;
	private String guardianEmail;
	private String guardianMobile;
	
}
