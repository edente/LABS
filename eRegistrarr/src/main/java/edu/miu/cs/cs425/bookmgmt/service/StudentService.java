package edu.miu.cs.cs425.bookmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs.cs425.bookmgmt.Repository.StudentRepository;
import edu.miu.cs.cs425.bookmgmt.model.Student;

@Service
public class StudentService {
	
@Autowired
    private StudentRepository studentRepository; 
	
     

     public Iterable<Student> getAllStudents(){
    	 return studentRepository.findAll();
    	 
     }


}
