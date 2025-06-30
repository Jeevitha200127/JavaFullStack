class Employe{
    String Emp_name="lavanya";
    String Emp_id="BH123";
    double Emp_salary=0.9d;

}
class Department{
    int Dep_id=1;
    String Dep_name="kavya";
}



public class Salary {

    public static void main(String[] args) {
        Employe e=new Employe();
        System.out.println("Employee name"+" "+e.Emp_name);
        System.out.println("Employee id"+" "+e.Emp_id);
        System.out.println("Employee salary"+" "+e.Emp_salary);
        Department d=new Department();
        System.out.println("Department id"+" "+d.Dep_id);
        System.out.println("Department name"+" "+d.Dep_name);

    }
}


