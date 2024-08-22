import java.util.Scanner;

class EH{
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);

        try
        {
        int a = 10;
        int b = 0;
        int c = a/b;
        System.out.println(c);
        }


        catch(Exception e){
            System.out.println("Exception is occuring " + e);
        }


        int []input = new int[6];

        System.out.println("The divisor is: ");
        int divisor = sc.nextInt();
         float output = 0f;
        
         if(divisor == 0){
            System.out.println("Cannot perform operation if divisor is 0");
         }

        System.out.println("5 dividend are: ");
        for(int i =1; i<=5; i++){
            input[i]=sc.nextInt();
            output = input[i]%divisor;
        System.out.println(output);

        }
    }
}