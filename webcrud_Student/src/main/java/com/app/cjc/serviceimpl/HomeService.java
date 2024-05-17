package com.app.cjc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.cjc.model.Student;
import com.app.cjc.repo.Homerepo;
import com.app.cjc.serviceInterface.HomeserviceInt;

@Repository
public class HomeService implements HomeserviceInt {
	
	@Autowired
	Homerepo hr;
	

	@Override
	public void addStudent(Student s) {
		
		hr.save(s);
		
	}

	@Override
	public List<Student> addStudentlist(List<Student> s) {
		List<Student> saveAll = hr.saveAll(s);
		return saveAll;
		
	}

	@Override
	public List<Student> getListOfStudent() {
		List<Student> list = hr.findAll();
		return list;
		
	}

	@Override
	public Student getSingleData(int rollno) {
		Student byRollno = hr.findByRollno(rollno);
		return byRollno;
	}

	@Override
	public void updateStudent(Student s) {
		
		hr.save(s);
		
	}

}
