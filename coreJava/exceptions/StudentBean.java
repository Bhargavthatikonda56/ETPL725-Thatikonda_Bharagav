package com.evergent.corejava.exceptions;


public class StudentBean {
	private int sno;
	private String sname;
	private String address;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student no: "+sno+"\nStudent Name: "+sname+"\nStudent Address: "+address;
	}
}