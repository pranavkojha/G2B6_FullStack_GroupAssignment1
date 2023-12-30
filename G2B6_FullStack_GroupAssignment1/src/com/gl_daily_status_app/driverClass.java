/** Great Learning Fullstack group assignment 1
 * @author Pranav Kumar Ojha, Faisal Raza Khan, Haritha, Shreya Singh, Prajna
 */

package com.gl_daily_status_app;

import com.gl_daily_status_app.departments.tech.TechDepartment;
import com.gl_daily_status_app.departments.hr.HrDepartment;
import com.gl_daily_status_app.departments.admin.AdminDepartment;

public class driverClass {
	
    
    public static void main(String[] args) {
    	AdminDepartment obj2 = new AdminDepartment();
        HrDepartment obj3 = new HrDepartment();
        TechDepartment obj4 = new TechDepartment();
        obj2.testAdminClass();
        System.out.println("");
        obj3.testHrClass();
        System.out.println("");
        obj4.testTechDepartment();
        System.out.println("");
    } 
 
   
}