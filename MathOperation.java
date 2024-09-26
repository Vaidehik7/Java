import java.util.Scanner;


class MathOperation{
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int numbers;
        double avg;
     
        System.out.println("Choose an Operation");
        System.out.println("1. Arithmetic Operation");
        System.out.println("2. Statistical Operation");
        System.out.println("3. Trigonometric Operation");
        System.out.println("4. Exit");

        int choice = sc.nextInt();
       int arr[] = new int[5];

        System.out.println("Choose an Operator");
        switch (choice) {
            case 1:
            System.out.println("Enter two numbers");
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println("Sum of numbers: "+ (n+m));
            System.out.println("Subtraction of numbers: "+ (n-m));
            System.out.println("Product of numbers: "+ (n*m));
            System.out.println("Quotient of numbers: "+ (n/m));
            break;

            case 2:
           
            System.out.println("Enter set of numbers seperated by spaces");
            for(int i = 1; i<=5; i++){
                 numbers = sc.nextInt();
                 sum = sum + numbers;
                
            }
                 avg = sum/5;
                 System.out.printf("Average: "+ avg);
                 break;

            case 3:
            System.out.println("3. Trigonometric operations");
            System.out.println("Enter angle in degree");
            double degrees = sc.nextDouble();
            //convert degree to radian
            double radians = Math.toRadians(degrees);

            //calculate sine, cos, tan values
            double sine = Math.sin(radians);
            double cosine = Math.cos(radians);
            double tangent = Math.tan(radians);

            System.out.printf("Sine of %.2f degrees: %.4f%n", degrees, sine);
            System.out.printf("Cosine of %.2f degrees: %.4f%n", degrees, cosine);
            System.out.printf("Tangent of %.2f degrees: %.4f%n", degrees, tangent);
            break;

            case 4:
            System.out.println("4. Exit");
            break;


        }
    }
    }
