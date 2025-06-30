class employee1{
    private String emp_name;
    private int emp_id;
   private int emp_salary;

    public void setEmpDetails(String emp_name1,int emp_id1,int emp_salary1) {
        this.emp_salary = emp_salary1;
        this.emp_name = emp_name1;
        this.emp_id = emp_id1;
    }
    public String getemp_name() {
        return emp_name;
    }
    public int getemp_id() {
        return emp_id;
    }
    public int getemp_salary() {
        return emp_salary;
    }
}
public class Employeedetails {
    public static void main(String[] args) {
        employee1 ep=new employee1();
        ep.setEmpDetails("kavya",2,50000);
      System.out.println("Employee deatils:-"+" "+"Empname:"+ep.getemp_name()+" "+"Empid:"+" "+ep.getemp_id()+" "+"Empsalary:"+" "+ep.getemp_salary());
    }
}
