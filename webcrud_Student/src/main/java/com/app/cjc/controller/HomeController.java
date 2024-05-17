package com.app.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.app.cjc.model.Student;
import com.app.cjc.serviceInterface.HomeserviceInt;


@RestController
public class HomeController {
	
	@Autowired
	HomeserviceInt hs;

	@GetMapping("/msg")
	public String showMassage()
	{
		return "Hello world....!";
	}
	
	@PostMapping("/add")
	public void addSingleStudent(@RequestBody Student s)
	{
		hs.addStudent(s);
	}
	
	@PostMapping("/addList")
     public List<Student> addListOfStudent(@RequestBody List<Student> s)
     {
    	 List<Student> list = hs.addStudentlist(s);
    	 return list;
     }
	
	@GetMapping("getAll")
	public List<Student> getAllStudent()
	{
		List<Student> listOfStudent = hs.getListOfStudent();
		
		return listOfStudent;
		
	}
	
	@GetMapping("getStudent/{rollno}")
	public Student getStudent(@PathVariable int rollno)
	{
		Student s = hs.getSingleData(rollno);
		
		return s;
		
	}
	
	@PutMapping("/update")
	public String updateStudentInfo(@RequestBody Student s)
	{
		hs.updateStudent(s);
		return"Student updated";
	}
	
	
	

}
