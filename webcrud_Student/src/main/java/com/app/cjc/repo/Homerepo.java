package com.app.cjc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.app.cjc.model.Student;

@Service
public interface Homerepo  extends JpaRepository<Student, Integer>{

	public Student findByRollno(int rollno);
	

}
