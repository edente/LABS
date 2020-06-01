package edu.miu.cs.cs425.bookmgmt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity 
public class Classroom {

@Id 
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long classroomId;
@NotBlank
@Column(name="building_Name")
 private String buildingName;
@NotBlank
@Column(name="room_Number")
private String roomNumber;
@OneToMany (mappedBy="classes")
private List<Student> Students;
public Classroom(String buildingName, String roomNumber) {
	super();
  	this.buildingName = buildingName;
	this.roomNumber = roomNumber;
}

public Classroom() {
	super();
}

public Long getClassroomId() {
	return classroomId;
}
public void setClassroomId(Long classroomId) {
	this.classroomId = classroomId;
}

public String getBuildingName() {
	return buildingName;
}
public void setBuildingName(String buildingName) {
	this.buildingName = buildingName;
}
public String getRoomNumber() {
	return roomNumber;
}
public void setRoomNumber(String roomNumber) {
	this.roomNumber = roomNumber;
}
	
	
	
 	
	
  	
	
	
	
	
	
	
 
}
