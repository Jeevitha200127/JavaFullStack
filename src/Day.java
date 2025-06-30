class Employee{
    String employeename;
    String employeeroll;
    double employeesalary;
Employee(String n,String r, double sal){
    employeename=n;
     employeeroll=r;
     employeesalary=sal;
}
public void employeeDetail(){
System.out.println("employeename:"+" "+employeename);
    System.out.println("employeeroll:"+" "+employeeroll);
    System.out.println("employeesalary:"+" "+employeesalary);
}
}
public class Day{
    public static void main(String[] args) {
Employee e=new Employee("Jeevitha","Java developer",350000);
e.employeeDetail();
    }
}
