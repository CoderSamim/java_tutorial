
import java.util.Scanner;
class demo{
    public static void main(String args []){
        System.out.print("hello");

        //create as static 1D
        int mark[] = {20,34,35,67,34,678,234};
        //declare marks[]    and initialize with 7 elements



        //create dynamic input array
        int marks[];   //declare arry
        marks = new int[5];  //allot memory for storing 5 elements

        // int marks[] =new int[5];   one line code

        /* marks[0]=20;
           marks[0]=30;
           marks[0]=60;  */
        

        //input from user for arry
        for(int i=0; i<5; i++){
            Scanner sc = new Scanner(System.in);
        
            marks[i] = sc.nextInt();
        }
        
       
        //print array
       for(int i=0;i<5;i++){
          System.out.print(marks[i]+ "\n");}
      }

    }

