/** Great Learning Fullstack group assignment 1
 * @author Pranav Kumar Ojha, Faisal Raza Khan, Haritha, Shreya Singh, Prajna
 */

package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.tech.TechDepartment;
import com.gl_daily_status_app.departments.hr.HrDepartment;
import com.gl_daily_status_app.departments.admin.AdminDepartment;

/**
 * This class implements the objects of different department
 * and displays the inheritance mechanism.
 */
public class driverClass {
	public static void main(String[] args) {
		// Create objects of all departments.
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		// Admin department.
		admin.testAdminClass();
    System.out.println("");

		// HR department.
    hr.testHrClass();
    System.out.println("");

		// Tech department.
    tech.testTechDepartment();
    System.out.println("");
	}
 
   
}