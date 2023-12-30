/** Great Learning Fullstack group assignment 1.
 *
 * @author Pranav Kumar Ojha
 */

// Package name.

package com.gl_daily_status_app.departments.superdepartment;



/**
 * This abstract class defined method to be defined by all departments.
 *
 */
public abstract class SuperDepartment {
	/**
	 * Department name.
	 *
	 * @return This method returns the department name as String.
	 */
	public String departmentName() {

		return "Super Department";
	}

	/**
	 * Get Today's work.
	 *
	 * @return This method returns the today's work String.
	 */
	public String getTodaysWork() {
			return "No work as of now";
	}

	/**
	 * Work deadline.
	 *
	 * @return This method returns the work's deadline as String.
	 */
	public String getWorkDeadline() {
			return "Nil";
	}

	/**
	 * Is today a holiday.
	 *
	 * @return This method returns if today is holiday or not as String.
	 */
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}

	
}
