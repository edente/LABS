package edu.miu.cs.cs425.bookmgmt.Repository;

import org.springframework.data.repository.CrudRepository;
 import org.springframework.stereotype.Repository;

import edu.miu.cs.cs425.bookmgmt.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
