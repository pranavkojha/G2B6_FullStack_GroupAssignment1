/** Great Learning Fullstack group assignment 1.
 *
 * @author Pranav Kumar Ojha
 */

// Package name.

package com.gl_daily_status_app.departments.superClass;

/**
 * This abstract class defined method to be defined by all departments.
 *
 */
public abstract class SuperDepartment {
  public String departmentName() {
		return "Super Department";
	}
	public String getTodaysWork() {
			return "No work as of now";
	}

	public String getWorkDeadline() {
			return "Nil";
	}
	public String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
