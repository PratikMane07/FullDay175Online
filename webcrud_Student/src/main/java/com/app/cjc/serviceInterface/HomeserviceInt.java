package com.app.cjc.serviceInterface;

import java.util.List;

import com.app.cjc.model.Student;

public interface HomeserviceInt {

	void addStudent(Student s);

	List<Student> addStudentlist(List<Student> s);

	List<Student>  getListOfStudent();

	Student getSingleData(int rollno);

	void updateStudent(Student s);

}
