package com.gl_daily_status_app.departments.tech;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;

/**
 * This class extends SuperDepartment class overriding SuperDepartment's methods
 * and defining its own methods
 */
public class TechDepartment extends SuperDepartment {
	/**
	 * Method to department name
	 */
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	/**
	 * Method to return today's work
	 */
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	/**
	 * Method to return work deadline
	 */
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * Class specific method to give tech stack information
	 * 
	 * @return
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}

}
