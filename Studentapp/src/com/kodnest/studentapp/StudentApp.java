package com.kodnest.studentapp;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "John";
		s.id = 45;
		System.out.println(s.name);
		System.out.println(s.id);
		s.study();
		s.sleep();
	}
}