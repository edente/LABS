package edu.miu.cs.cs425.bookmgmt.model;

import java.time.LocalDate;
import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

@Entity 
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long studentId;
	@NotBlank 
	private String studentNumber;
	@NotBlank
	private String firstName;
	@NotBlank
	private String middleName;
	@NotBlank
	private String LastName;
	private Double cgpa;
	private LocalDate dateOfEnrollment;
	@ManyToOne(cascade= CascadeType.PERSIST)
	@JoinColumn(name="Class_room")
	private Classroom classes;
	@OneToOne (cascade = CascadeType.PERSIST)
	@JoinColumn(name="Transcript")
	private Transcript transcripts;
	
	public Student(String studentNumber, String firstName, String middleName, String lastName, Double cgpa,
			LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.LastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	
	public Student() {
		super();
	}


	public Classroom getClasses() {
		return classes;
	}


	public void setClasses(Classroom classes) {
		this.classes = classes;
	}


	public Transcript getTranscripts() {
		return transcripts;
	}


	public void setTranscripts(Transcript transcripts) {
		this.transcripts = transcripts;
	}


	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Double getCgpa() {
		return cgpa;
	}
	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	
	
	
	
	
	
	
	
 
}
