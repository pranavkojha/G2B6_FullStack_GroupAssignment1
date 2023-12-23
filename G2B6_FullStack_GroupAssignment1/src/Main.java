
public class Main {
    public static void testSuperClass() {
        SuperDepartment s = new SuperDepartment();
        System.out.println("Department Name: " + s.departmentName());
        System.out.println("Holiday?        : " + s.isTodayAHoliday());
        System.out.println("Today's work   : " + s.getTodaysWork());
        System.out.println("Work deadline  : " + s.getWorkDeadline());
    }
    public static void main(String[] args) {
        testSuperClass();
    }
}