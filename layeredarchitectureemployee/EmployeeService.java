package com.evergent.corejava.employee;

public class EmployeeService {
	 
	public int addEmployeeService(int id,String name,float exp)
	{
		float sal;
		if(exp<2.5)
		{
			sal=45000;
		}
		else if(exp<5)
		{
			sal=75000;
		}
		else
		{
			sal=100000;
		}
		EmployeeDAO employeeDAO=new EmployeeDAO();
		EmployeeBean empbean=new EmployeeBean();
		empbean.setId(id);
		empbean.setName(name);
		empbean.setExp(exp);
		empbean.setSal(sal);
		int updateResult= employeeDAO.addEmployee(empbean);
		return updateResult;
	}
}
