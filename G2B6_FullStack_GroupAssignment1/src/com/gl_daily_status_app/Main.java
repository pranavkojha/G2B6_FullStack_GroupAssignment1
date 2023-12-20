package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.tech.TechDepartment;

public class Main {
    
    public static void main(String[] args) {
//        testSuperClass();
        testTechDepartment();
    }
    
    private static void testTechDepartment() {
		TechDepartment tech = new TechDepartment();
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.departmentName());
		System.out.println(tech.isTodayAHoliday());
		
	}

//	public static void testSuperClass() {
//        SuperDepartment s = new SuperDepartment();
//        System.out.println("Department Name: " + s.departmentName());
//        System.out.println("Holiday?       : " + s.isTodayAHoliday());
//        System.out.println("Today's work   : " + s.getTodaysWork());
//        System.out.println("Work deadline  : " + s.getWorkDeadline());
//    }
 
}