# G2B6_FullStack_GroupAssignment1
Group Assignment 1- 50 Marks- Nov'23

# Problem Statement
<p> The assignment will contain 4 departments as four different object classes </p>
- Super Department
- Admin Department
- Hr Department
- Tech Department

<p> **Super Department** class will be the superclass and all other departments must extend it.
Super department will contain 4 methods of return type String and will not accept any parameter </p>
- departmentName
- getTodaysWork
- getWorkDeadline
- isTodayAHoliday

<p> departmentName will return “ Super Department “ <br>
getTodaysWork will return “ No Work as of now” <br>
getWorkDeadline will return “ Nil “ <br>
isTodayAHoliday will return “ Today is not a holiday” </p>
  
<p> **Admin department** will contain 3 methods of return type String and will not accept any
parameter </p>
- departmentName
- getTodaysWork
- getWorkDeadline
<p> departmentName will return “ Admin Department “ <br>
getTodaysWork will return “Complete your documents Submission” <br>
getWorkDeadline will return “ Complete by EOD “ <br> </p>

<p> **HR department** will contain 4 methods of return type String and will not accept any
parameter </p>
- departmentName
- getTodaysWork
- getWorkDeadline
- doActivity
<p> departmentName will return “ Hr Department “ <br>
getTodaysWork will return “ Fill today’s timesheet and mark your attendance” <br>
getWorkDeadline will return “ Complete by EOD “ <br>
doActivity “team Lunch” <br>
</p>
  
<p> **Tech department** will contain 4 methods of return type String and will not accept any
parameter </p>
- departmentName
- getTodaysWork
- getWorkDeadline
- getTechStackInformation 
<p> departmentName will return “ Tech Department “ <br>
getTodaysWork will return “ Complete coding of module 1” <br>
getWorkDeadline will return “ Complete by EOD “ <br>
getTechStackInformation will return “core Java” <br>
</p>

<p> **Driver class** Main will be used to create objects of HrDepartment, TechDepartment,
AdminDepartment </p> 
- Each department will display all its functionalities.
- Each department will display whether today is a holiday or not with the help of the Super
<p> Department. (SuperDepartment will act as a super class for all the departments) </p>

### Expected Output
`Welcome to Admin Department
Complete your documents submission
Complete by EOD
Today is not a Holiday
Welcome to HR Department
team Lunch
Fill today’s timesheet and mark your attendance
Complete by EOD
Today is not a Holiday
Welcome to Tech Department
Complete coding of Module 1
Complete by EOD
Core Java
Today is not a Holiday`
