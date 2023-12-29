package com.gl_daily_status_app.departments.tech;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;

/**
 * This class extends SuperDepartment class overriding SuperDepartment's methods
 * and defining its own methods
 */
public class TechDepartment extends SuperDepartment {
	/**
	 * Method to get department name
	 */
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	/**
	 * Method to get today's work
	 */
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	/**
	 * Method to get work deadline
	 */
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * Class specific method to give tech stack information
	 * @return
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}


	public void testTechDepartment() {
       // TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
        System.out.println("++++++++++++++");
    }
	

}
