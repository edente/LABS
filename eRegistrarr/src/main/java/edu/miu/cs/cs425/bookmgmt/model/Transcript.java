package edu.miu.cs.cs425.bookmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotBlank;

@Entity 
public class Transcript {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transcriptId;
	@NotBlank
	@Column(name="degree_")
	private String degreeTitle;
	
	
	public Transcript() {
		super();
	}
	public Transcript( String degreeTitle) {
		super();
 		this.degreeTitle = degreeTitle;
	}
	public Long getTranscriptId() {
		return transcriptId;
	}
 	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	 
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	
	
	

}
