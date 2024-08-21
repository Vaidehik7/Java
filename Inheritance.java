// Algorithm:
// 1 Create class Person having data members name, birthdate, height, weight, address and
// calculateAge method.
// 2 Create classes Student and Employee which will extend Person class
// 3. Derive class Student with members as roll no, marks, calculateAvg().
// 4. Also derive class Employee with members as empId, salary, calculateTax().
// 5. Create InheritanceTest class consisting main method for creating the objects of the
// Person/Student/Employee classes.
// 6. Demonstrate the access of properties and behaviors of Person class in Student and
// Employee class.


class Person{
    String name;
    int birth_year;
    double height;
    double weight;
    // String address;
    int result;

   public int calculateAge(){
         result = 2024 - birth_year;
         return result;
    }

    public void display_Age(){
        System.out.println("Age is " + result);
    }

   
}

class Child extends Person{
    int roll_no;
    int []marks = new int[5];
    int avg ;
    int sum = 0;

   public double calculateAvg()
    {
      for(int i = 0; i<5; i++){
        sum = sum + marks[i];
      }
      avg= sum/5;
      return avg;
    }

    public void display(){
        System.out.println("Name of Student is "+ name);
        System.out.println("birth year of Person is " + birth_year);
        System.out.println("height of Person is " + height);
        System.out.println("weight of person is " + weight);
        System.out.println("Age is "+ calculateAge());
        System.out.println("Average "+ calculateAvg());
        System.out.println("\n");
    }
}
        
class Employee extends Person{
    int emp_id;
    float salary;

    float calculateTax(){
        float tax;
        tax = salary * 0.10f;
        return tax;
    }
  
    public void display(){
        System.out.println("Name of Student is "+ name);
        System.out.println("birth year of Person is " + birth_year);
        System.out.println("height of Person is " + height);
        System.out.println("weight of person is " + weight);
        System.out.println("Age is "+ calculateAge());
        System.out.println("Tax: "+ calculateTax());
        System.out.println("\n");
    }
     

}


class Inheritance{
public static void main(String args[]){
      Child c = new Child();
      c.name = "Vaidehi";
      c.birth_year = 2004;
      c.height = 150;
      c.weight = 45;
      c.roll_no = 130;
      c.marks[0] = 10;
      c.marks[1] = 11;
      c.marks[2] = 12;
      c.marks[3] = 13;
      c.marks[4] = 14;
      c.display();
    //   c.display_Age();
      Employee e1 = new Employee();
      e1.name = "Ketaki";
      e1.birth_year = 2000;
      e1.height = 140;
      e1.weight = 90;
      e1.salary = 10000000;
      e1.emp_id = 32323;
      e1.display();


  }
}
