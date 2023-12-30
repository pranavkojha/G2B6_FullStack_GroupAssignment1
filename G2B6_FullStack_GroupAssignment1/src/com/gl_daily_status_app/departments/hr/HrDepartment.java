package com.gl_daily_status_app.departments.hr;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;
public class HrDepartment extends SuperDepartment{

    /**
     * Department name.
     *
     * @return This method returns the department name as String.
     */
    @Override
    public String departmentName() {
        return "HR Department";
    }

    /**
     * Get Today's work.
     *
     * @return This method returns the today's work String.
     */
    @Override
    public String getTodaysWork() {
        return "Fill today"+"'"+"s timesheet and mark your attendance";
    }

    /**
     * Work deadline.
     *
     * @return This method returns the work's deadline as String.
     */
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Method to perform an activity
    public String doActivity() {
        return "Team Lunch";
    }

    /**
     * This method is used to test the HR department.
     */
    public  void testHrClass() {
        //Creating an instance of HrDepartment
        HrDepartment hrDepartment = new HrDepartment();

        //Calling the methods and printing the results
        System.out.println("Welcome To " + hrDepartment.departmentName());
        System.out.println(hrDepartment.doActivity());
        System.out.println( hrDepartment.getTodaysWork());
        System.out.println( hrDepartment.getWorkDeadline());
        System.out.println(isTodayAHoliday());
        System.out.println("++++++++++++++");
    }


}
