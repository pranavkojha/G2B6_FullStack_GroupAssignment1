# G2B6_FullStack_GroupAssignment1
Group Assignment 1- 50 Marks- Nov'23

# Problem Statement
The assignment will contain 4 departments as four different object classes 

 - Super Department
 - Admin Department
 - Hr Department
 - Tech Department


**Super Department** class will be the superclass and all other departments must extend it.
Super department will contain 4 methods of return type String and will not accept any parameter
- departmentName
- getTodaysWork
- getWorkDeadline
- isTodayAHoliday

<p> departmentName will return “ Super Department “ <br>
getTodaysWork will return “ No Work as of now” <br>
getWorkDeadline will return “ Nil “ <br>
isTodayAHoliday will return “ Today is not a holiday” </p>
  
**Admin department** will contain 3 methods of return type String and will not accept any parameter 
- departmentName
- getTodaysWork
- getWorkDeadline
<p> departmentName will return “ Admin Department “ <br>
getTodaysWork will return “Complete your documents Submission” <br>
getWorkDeadline will return “ Complete by EOD “ <br> </p>

**HR department** will contain 4 methods of return type String and will not accept any parameter 
- departmentName
- getTodaysWork
- getWorkDeadline
- doActivity

departmentName will return “ Hr Department “ <br>
getTodaysWork will return “ Fill today’s timesheet and mark your attendance” <br>
getWorkDeadline will return “ Complete by EOD “ <br>
doActivity “team Lunch” <br>

  
**Tech department** will contain 4 methods of return type String and will not accept any parameter 
- departmentName
- getTodaysWork
- getWorkDeadline
- getTechStackInformation 

departmentName will return “ Tech Department “ <br>
getTodaysWork will return “ Complete coding of module 1” <br>
getWorkDeadline will return “ Complete by EOD “ <br>
getTechStackInformation will return “core Java” <br>


**Driver class** Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment 
- Each department will display all its functionalities.
- Each department will display whether today is a holiday or not with the help of the Super
<p> Department. (SuperDepartment will act as a super class for all the departments) </p>

### Expected Output
> Welcome to Admin Department <br>
Complete your documents submission <br>
Complete by EOD <br>
Today is not a Holiday <br>
Welcome to HR Department <br>
team Lunch <br>
Fill today’s timesheet and mark your attendance <br>
Complete by EOD <br>
Today is not a Holiday <br>
Welcome to Tech Department <br>
Complete coding of Module 1 <br>
Complete by EOD <br>
Core Java <br>
Today is not a Holiday <br>
