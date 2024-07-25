import java.util.Scanner;
class Emp1{
   
  String []name = new String[5];

  int []id = new int[5];
 
  float []salary = new float[5];

  Scanner sc = new Scanner(System.in);
    void getInfo(){
   
    for(int i = 0; i<5; i++){
        System.out.println("Enter names of 5 Employees" +(i+1) + ":");
        name[i] = sc.next();
    }

    for(int i = 0; i<5; i++){
        System.out.println("Enter ID of 5 Employees"+ (i+1) + ":");
        id[i] = sc.nextInt();
    }

    for(int i = 0; i<5; i++){
        System.out.println("Enter Salary of 5 Employees"+ (i+1) + ":");
        salary[i] = sc.nextFloat();
    }
    }

    void Display(){
        for(int i=0; i<5; i++){
            System.out.println("Name: " + name[i] + ", ID: " + id[i] + ", Salary: " + salary[i]);
        }
    }
}

class Emp{
    public static void main(String []args){
        Emp1 e = new Emp1();
        e.getInfo();
        e.Display();
    }
}