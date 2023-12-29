package com.gl_daily_status_app.departments.admin;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;

public class AdminDepartment extends SuperDepartment{
	
	@Override
	public String departmentName()
	{
		
		String departmentName="Admin Department";
		
		return departmentName;
	} 
	
	@Override
	public String getTodaysWork()
	{
		
		String getTodaysWork="Complete your documents Submission";
		
		return getTodaysWork;
	} 
	
	@Override
	public String getWorkDeadline()
	{
		
		String getWorkDeadline="Complete by EOD";
		
		return getWorkDeadline;
	} 

	public  void testAdminClass() {
        //Creating an instance of HrDepartment
       // AdminDepartment admin = new AdminDepartment();

        System.out.println("Welcome to " + departmentName());
        System.out.println( getTodaysWork());
        System.out.println( getWorkDeadline());
        System.out.println(isTodayAHoliday());
        System.out.println("++++++++++++++");
    }

}