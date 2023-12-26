/** Great Learning Fullstack group assignment 1
 * @author Pranav Kumar Ojha, Faisal Raza Khan, Haritha, Shreya Singh, Prajna
 */

package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.tech.TechDepartment;
import com.gl_daily_status_app.departments.hr.HrDepartment;
import com.gl_daily_status_app.departments.admin.AdminDepartment;

public class Main {
	public void init() {
		TechDepartment tech = new TechDepartment();
		AdminDepartment admn = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
        System.out.println("++++++++++++++");
        System.out.println("Department Name: " + hr.departmentName());
        System.out.println("Today's Work: " + hr.getTodaysWork());
        System.out.println("Work Deadline: " + hr.getWorkDeadline());
        System.out.println("Activity: " + hr.doActivity());
        System.out.println("++++++++++++++");
        System.out.println("Department Name: " + admn.departmentName());
        System.out.println("Today's Work: " + admn.getTodaysWork());
        System.out.println("Work Deadline: " + admn.getWorkDeadline());
        System.out.println("Activity: " + admn.getWorkDeadline());
        System.out.println("++++++++++++++");       
	}
    
    public static void main(String[] args) {
    	Main obj = new Main();
    	obj.init();
//        testTechDepartment();
//        testHrClass();
//        testAdminClass();
    }
    
    private static void testTechDepartment() {
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
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