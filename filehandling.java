import java.io.*;
import java.util.Scanner;

class filehandling{
    public static void main(String []args){
        File f = new File("d:\\22UAI130\\abc.txt");
        File f1 = new File("d:\\22UAI130\\abcd.txt");
        try{
           
            if(f.createNewFile()){
                System.out.println("File has been created successfully");
            }

           else if(f1.createNewFile()){
                System.out.println("File has been created successfully");
            }

            else{
                System.out.println("File existed");
            }
            
            FileWriter w = new FileWriter("d:\\22UAI130\\abc.txt");
            w.write("Hi\nnamskar\nBanjour\nKon'nichiwa\nannyeonghaseyo");
            w.close();
            
            Scanner r = new Scanner(f);
            while(r.hasNextLine()){
                String data = r.nextLine();
                System.out.println(data);
            }
           
        }
        catch (Exception e){
            System.out.println("Exception occured"+ e);
        }
    }
  
}