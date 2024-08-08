import java.util.Scanner;

public class Employee{
    private String emp_name;
    private int emp_id;
    private double salary;

    Employee(String emp_name, int emp_id, double salary){
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
    }
  
         public void setname(String emp_name){
         this.emp_name = emp_name;
         }

         public String getname(){
         return emp_name;
         }

         public void setid(int emp_id){
         this.emp_id = emp_id;
         }

         public int getid(){
         return emp_id;
         }

         public void setsalary(double salary){
         this.salary = salary;
         }

         public double getsalary(){
         return salary;
         }

         
        public void raisesalary(){
        this.salary = this.salary * 1.10;
         }


        public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the name: ");
        String emp_name = sc.nextLine();

        System.out.println("Enter the id: ");
        int emp_id = sc.nextInt();

        System.out.println("Enter the salary: $");
        double salary = sc.nextDouble();
 
       Employee e1 = new Employee(emp_name, emp_id, salary);

        System.out.println("Employee Details are: ");
        System.out.println("Employee name"+e1.getname());
        System.out.println("Employee id is"+ e1.getid());
        System.out.println("EMployee salalry  $:"+ e1.getsalary());
       
        //salalry After raise of 1.15%
        e1.raisesalary();
        System.out.println("\nUpdated salary of an employeeee: "+ e1.getsalary());
       sc.close();
}

}
    