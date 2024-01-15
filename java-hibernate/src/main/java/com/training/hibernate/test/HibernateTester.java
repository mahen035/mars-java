package com.training.hibernate.test;

import java.util.List;

import com.training.hibernate.dao.StudentDao;
import com.training.hibernate.entity.Student;

public class HibernateTester {

	public static void main(String[] args) {
		
		StudentDao studentDao = new StudentDao();
		Student stud = new Student("Jack","brown","db@mail.com");
		studentDao.saveStudent(stud);
		
		List<Student> studList = studentDao.getStudents();
		
		for(Student student:studList) {
			System.out.println(student.getFirstName()+":"+student.getLastName());
		}
		
		//studList.forEach(s->System.out.println(s.getFirstName()+":"+s.getLastName()));

	}

}
