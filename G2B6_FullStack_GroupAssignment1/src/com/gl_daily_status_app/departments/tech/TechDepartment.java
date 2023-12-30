/**
 * @author Faisalraza
 */
package com.gl_daily_status_app.departments.tech;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;

/**
 * This class extends SuperDepartment class overriding SuperDepartment's methods
 * and defining its own methods
 */
public class TechDepartment extends SuperDepartment {
	/**
	 * Method to get department name.
	 *
	 * @return This method returns the department name as String.
	 */
	@Override
	public String departmentName() {
		return "Tech Department";
	}

	/**
	 * Method to get today's work.
	 *
	 * @return This method returns the today's work String.
	 */
	@Override
	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	/**
	 * Method to get work deadline
	 *
	 * @return This method returns the work's deadline as String.
	 */
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	/**
	 * Class specific method to give tech stack information.
	 *
	 * @return String about the tech stack used in this department.
	 */
	public String getTechStackInformation() {
		return "Core Java";
	}


	/**
	 * This method is used to test the Tech department.
	 */
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
