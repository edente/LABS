package edu.miu.cs.cs425.bookmgmt.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

	@GetMapping(value= {"/","/home", "/index"})
	public String studentHomepage() {
		return "home/index";
	}
	
	
	
	
}
