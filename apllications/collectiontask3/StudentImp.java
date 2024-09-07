package com.evergent.corejava.bhargav.application4;

import java.util.HashSet;
import java.util.Set;

public class StudentImp implements StudentInterface 
{
	Set<Student> studentdata=new HashSet<Student>();
	
	public void addstudent(Student s)
	{
		 studentdata.add(s);
		 System.out.println("student data added");
	}
	public void searchbyid(int id)
	{
		boolean b=false;
		if(studentdata.size()>0){
			for(Student S:studentdata){
				if(S.getid()==id){
					System.out.println("student data found : ");
					System.out.println(S.getid()+" "+S.getName()+" "+S.branch());	
					b=true;
					break;	
				}
			}
		}
		if(!b)
			System.out.println("student data not found");	
	}
	public void getallstudents()
	{
		if(studentdata.size()>0){
			for(Student S: studentdata){
				System.out.println(S.getid()+" "+S.getName()+" "+S.branch());
			}
				
		}else{
			System.out.println("No student data is available ");
		}
	}
}
