package edu.miu.cs.cs425.bookmgmt.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.miu.cs.cs425.bookmgmt.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
     @GetMapping("students/list")
     
     public ModelAndView getStudent() {
    	 ModelAndView model=new ModelAndView();
    	 model.addObject("students",studentService.getAllStudents());
         model.setViewName("student/list");
         return model;
    			 
}
}
