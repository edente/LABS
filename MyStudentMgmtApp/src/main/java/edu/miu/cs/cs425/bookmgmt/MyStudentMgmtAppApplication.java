package edu.miu.cs.cs425.bookmgmt;

import java.time.LocalDate;
import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs.cs425.bookmgmt.Repository.StudentRepository;
import edu.miu.cs.cs425.bookmgmt.model.Classroom;
import edu.miu.cs.cs425.bookmgmt.model.Student;
import edu.miu.cs.cs425.bookmgmt.model.Transcript;

@SpringBootApplication
@Transactional
public class MyStudentMgmtAppApplication implements CommandLineRunner{
	
    @Autowired
    private StudentRepository repo;
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
		
	
	}

	@Override
	public void run(String... args) throws Exception {
    
		Classroom C1=new Classroom("McLaughlin building", "M105");

		Student S1= new Student("000-61-0001","Anna","Lynn","Smith", 3.45, LocalDate.of(2019, 05, 24));
		Student S2= new Student("243-61-0001","Selam","Samuel","Jackson", 1.75, LocalDate.of(2018, 04, 12));
		Student S3= new Student("123-61-0001","petros","solomon","berhe", 2.55, LocalDate.of(2019, 06, 12));
		Student S4= new Student("456-61-0001","meron","tekle","berhe", 2.35, LocalDate.of(2019, 06, 12));
		Student S5= new Student("567-61-0001","fana","hidru","zemuy", 2.45, LocalDate.of(2019, 06, 12));

		Transcript T1= new Transcript("BS Computer Science");
		Transcript T2= new Transcript("BS Computer Engineering");
		Transcript T3= new Transcript("BS Software Engineering");
		Transcript T4= new Transcript("BS Software Engineering");
		Transcript T5= new Transcript("BS Computer Science");


		S1.setTranscripts(T1);
		S2.setTranscripts(T2);
		S3.setTranscripts(T3);
		S4.setTranscripts(T4);
		S5.setTranscripts(T5);
		S1.setClasses(C1);
		S2.setClasses(C1);
		S3.setClasses(C1);
		S4.setClasses(C1);
		S5.setClasses(C1);


		
		saveStudent(S1);
		saveStudent(S2);
		saveStudent(S3);
		saveStudent(S4);
		saveStudent(S5);

		
 
		
		//repo.save(S1);
		//repo.save(S2);
	}
	
	private Student saveStudent(Student s) {
		return repo.save(s);
	}

}
