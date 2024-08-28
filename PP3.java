//by using get set method, calculate intrest
//enter amout that borrorwed by person
//calculate interest function for that money
import java.util.Scanner;
public class PP3 {

   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount the person has borrowed");
        int amt = sc.nextInt();

        System.out.println("Enter the Interest Rate");
        double intrest_rate = sc.nextDouble();

        System.out.println("Enter the years");
        int time = sc.nextInt();

        double result =((amt * intrest_rate * time)/100);

        System.out.println(result);

    }
}
