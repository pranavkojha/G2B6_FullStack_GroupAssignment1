package com.gl_daily_status_app.departments.admindepartment;

import com.gl_daily_status_app.departments.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	/**
	 * Department name.
	 *
	 * @return This method returns the department name as String.
	 */
	@Override
	public String departmentName() {

		String departmentName = "Admin Department";

		return departmentName;
	}

	/**
	 * Get Today's work.
	 *
	 * @return This method returns the today's work String.
	 */
	@Override
	public String getTodaysWork() {

		String getTodaysWork = "Complete your documents Submission";

		return getTodaysWork;
	}

	/**
	 * Work deadline.
	 *
	 * @return This method returns the work's deadline as String.
	 */
	@Override
	public String getWorkDeadline() {

		String getWorkDeadline = "Complete by EOD";

		return getWorkDeadline;
	}

	/**
	 * This method is used to test the Admin department.
	 */
	public void testAdminDepartment() {
		// Creating an instance of AdminDepartment
		AdminDepartment admin = new AdminDepartment();

		// Calling the methods and printing the results
		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println("++++++++++++++");
	}

}