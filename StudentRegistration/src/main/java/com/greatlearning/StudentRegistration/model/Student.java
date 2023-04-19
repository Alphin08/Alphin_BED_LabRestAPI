package com.greatlearning.StudentRegistration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@Data

public class Student {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "FirstName")	
	private String firstName;

	@Column(name = "LastName")		
	private String lastName;

	@Column(name = "Course")		
	private String course;

	@Column(name = "Country")		
	private String country;

	public Student() {

	}

	public Student(String fname, String lname, String course, String country) {

		this.firstName = fname;
		this.lastName = lname;
		this.course = course;
		this.country = country;

	}

}
