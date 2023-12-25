/** Great Learning Fullstack group assignment 1
 * @author Pranav Kumar Ojha, Faisal Raza Khan, Haritha, Shreya Singh, Prajna
 */

package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.tech.TechDepartment;
import com.gl_daily_status_app.departments.hr.HrDepartment;
import com.gl_daily_status_app.departments.admin.AdminDepartment;

public class Main {
    
    public static void main(String[] args) {
        testTechDepartment();
        testHrClass();
        testAdminClass();
    }
    
    private static void testTechDepartment() {
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.departmentName());
		System.out.println(tech.isTodayAHoliday());
        System.out.println("++++++++++++++");
	}

    public static void testHrClass() {
        //Creating an instance of HrDepartment
        HrDepartment hrDepartment = new HrDepartment();

        //Calling the methods and printing the results
        System.out.println("Department Name: " + hrDepartment.departmentName());
        System.out.println("Today's Work: " + hrDepartment.getTodaysWork());
        System.out.println("Work Deadline: " + hrDepartment.getWorkDeadline());
        System.out.println("Activity: " + hrDepartment.doActivity());
        System.out.println("++++++++++++++");
    }

    public static void testAdminClass() {
        //Creating an instance of HrDepartment
        AdminDepartment admin = new AdminDepartment();

        //Calling the methods and printing the results
        System.out.println("Department Name: " + admin.departmentName());
        System.out.println("Today's Work: " + admin.getTodaysWork());
        System.out.println("Work Deadline: " + admin.getWorkDeadline());
        System.out.println("Activity: " + admin.getWorkDeadline());
        System.out.println("++++++++++++++");
    }
}