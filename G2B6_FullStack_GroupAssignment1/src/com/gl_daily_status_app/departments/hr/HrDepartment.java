package com.gl_daily_status_app.departments.hr;

import com.gl_daily_status_app.departments.superClass.SuperDepartment;
public class HrDepartment extends SuperDepartment{

    // Method to return department name
    @Override
    public String departmentName() {
        return "Hr Department";
    }

    // Method to return today's work
    @Override
    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    // Method to return work deadline
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Method to perform an activity
    public String doActivity() {
        return "Team Lunch";
    }


}
