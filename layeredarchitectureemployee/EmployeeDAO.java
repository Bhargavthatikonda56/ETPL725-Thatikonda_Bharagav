package com.evergent.corejava.employee;

import java.util.ArrayList;

public class EmployeeDAO {
      public int addEmployee(EmployeeBean empbean)
      {
    	  try
    	  {
    		  ArrayList EmployeeList=new ArrayList();
    		  EmployeeList.add(empbean.getId());
    		  EmployeeList.add(empbean.getName());
    		  EmployeeList.add(empbean.getExp());
    		  EmployeeList.add(empbean.getSal());
    		  
    		  System.out.println(EmployeeList);
    		  return 1;
  		}
  		catch(Exception e)
  		{
  			System.out.println(e);
  			return 0;
  		}
      }
}
