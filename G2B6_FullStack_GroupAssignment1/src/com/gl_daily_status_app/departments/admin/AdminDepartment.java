package com.gl_daily_status_app.departments.admin;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;

public class AdminDepartment extends SuperDepartment{

	/**
	 * Department name.
	 *
	 * @return This method returns the department name as String.
	 */
	@Override
	public String departmentName()
	{
		
		String departmentName="Admin Department";
		
		return departmentName;
	}

	/**
	 * Get Today's work.
	 *
	 * @return This method returns the today's work String.
	 */
	@Override
	public String getTodaysWork()
	{
		
		String getTodaysWork="Complete your documents Submission";
		
		return getTodaysWork;
	}

	/**
	 * Work deadline.
	 *
	 * @return This method returns the work's deadline as String.
	 */
	@Override
	public String getWorkDeadline()
	{
		
		String getWorkDeadline="Complete by EOD";
		
		return getWorkDeadline;
	}

	/**
	 * This method is used to test the Admin department.
	 */
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