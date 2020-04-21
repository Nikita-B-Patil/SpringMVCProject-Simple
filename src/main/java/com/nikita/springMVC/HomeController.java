package com.nikita.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "index";
	}
	
//	Using Model attribute as parameter
//	@RequestMapping("addEmployee")
//	public String addEmployee(@ModelAttribute Employee emp) {			
//		return "result";
//		
//	}
	
	
//	Using request param and model object
//	@RequestMapping("addEmployee")
//	public String addEmployee(@RequestParam("username") String user, @RequestParam("password") String pass, Model m){
//		Employee e = new Employee();
//		e.setUsername(user);
//		e.setPassword(pass);
//		m.addAttribute("employee", e);
//		return "result";
//		
//	}
	
//	Using model attribute and class object
	@RequestMapping("addEmployee")
	public String addEmployee(@ModelAttribute Employee emp, Model m) {
		m.addAttribute("employee", emp);			
		return "result";
		
	}
}
