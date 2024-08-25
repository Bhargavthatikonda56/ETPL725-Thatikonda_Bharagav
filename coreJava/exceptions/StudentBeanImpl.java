package com.evergent.corejava.exceptions;

public class StudentBeanImpl {
	public static void main(String[] args) {
		StudentBean stu=new StudentBean();
		stu.setSno(100);
		stu.setName("Bhargav");
		stu.setAddress("Hyd");
		System.out.println(stu);
	}
}
