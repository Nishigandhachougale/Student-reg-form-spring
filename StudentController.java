package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;

@Controller
public class StudentController
{
	@Autowired
	StudentRepository rep;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addStudent")
	public String addStudent(Student stud)
	{
		rep.save(stud);
		return "home.jsp";
	}
	
	
	  @RequestMapping("/getStudent")
	  public ModelAndView getStudent(@RequestParam("id") int id) {
		  ModelAndView mv=new ModelAndView("ShowStudent.jsp");
	try {
		  
		  Student stud=rep.findById(id).orElse(null);
		  
		 // System.out.println(rep.findById(id));
		  System.out.println(stud);
	      mv.addObject("stud",stud);
	      
	  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	 return mv;
	  }
	  
	  @RequestMapping("/delStudent")
	  public String delStudent(@RequestParam("id") int id)
		{
			rep.deleteById(id);
			return "DeleteStudent.jsp";
		}
}
	 
	
	
