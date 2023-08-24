java.util.Scanner;
class Io{
      public static void main(String[] args){
          int i,a[100];
          
          for(i=0;i<=10;i++){
             
             Scanner obj=new Scanner(System.in);

             a[i]=obj.nextInt();}
             //.nextLine()  use for long string input
             //.next()  use for single string input



          for(i=0;i<=10;i++){
          System.out.print(a[i]+ "\n");}
      }
}

//java.util  is package(like a directory)
//Scanner is a class
//class can be used as a data type