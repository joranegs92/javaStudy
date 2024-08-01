package com.example.java.hashmap;


public class EmployeeTest {
	public static void main(String[] args){
		/*
		* 1.
		* public class Employee {
		* private Integer Id;
		* private String nm;
		* }
		* */
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setId(100);
		e2.setId(100);
		e1.setNm("na");
		e2.setNm("na");

		System.out.println(e1.equals(e2));  // false



	}
}
