//string constant pool is a separate memory block where string objects held by JVM.

class Demo{
    public static void main(String args[]){
       
        String s =  "samim";    //String also a class in java.lang package
        //when we crete a string object from String class , the object is created in string constant pool but it's not for char array
        //here jvm check if already same object available or not, if not available then create new neither not.
         System.out.println(s);


         //2nd method to create sting
         String p = new String("hello");
         //here jvm always create a new string object, it doesn't check string constant pool.


         //3rd method to create a string using char array
        char arr[]={'s','a','m','i','m'};

        String st = new String(arr);

        // sub part of 3rd step (for a specific range)

        String k = new String(arr,  2,3);   //print 2 to 4, one extra

        System.out.print(k);

    }
}