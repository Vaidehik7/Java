import java.util.Scanner;

interface Stack{
    int push(int push_ele);
    void pop();
    int Display();
}

class Stack1 implements Stack{
   Scanner sc = new Scanner(System.in);
    public int top = -1;
    int []array;
    int MAXSIZE;

    System.out.println("Enter the Size: ");
    MAXSIZE = sc.nextInt();
    public int push(int push_ele){
        if(top == MAXSIZE-1){
            System.out.println("\n We cannot push elemtns in Stack");
        }
        else{
            System.out.println("Successfully Inserted element in your stack", push_ele);
            arr[top++];

        }
    }
}

class Stack2{
    public static void main(String args[]){
        Stack s1 = new Stack1();
    }
}