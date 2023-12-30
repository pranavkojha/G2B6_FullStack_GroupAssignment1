/** Great Learning Fullstack group assignment 1
 * @author Pranav Kumar Ojha, Faisal Raza Khan, Haritha, Shreya Singh, Prajna
 */

package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.admindepartment.AdminDepartment;
import com.gl_daily_status_app.departments.hrdepartment.HrDepartment;
import com.gl_daily_status_app.departments.techdepartment.TechDepartment;

/**
 * This class implements the objects of different department and displays the
 * inheritance mechanism.
 */
public class Main {
	public static void main(String[] args) {
		// Create objects of all departments.
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		// Admin department.
		admin.testAdminDepartment();
		System.out.println("");

		// HR department.
		hr.testHrDepartment();
		System.out.println("");

		// Tech department.
		tech.testTechDepartment();
		System.out.println("");
	}

}