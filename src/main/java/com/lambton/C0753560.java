package com.lambton;

public class C0753560
{
    public static void main(String args[])
    {
        LambtonStringTools obj = new LambtonStringTools();
       obj.ReverseString("Lambton");
       obj.ReverseString("Naina");


       String s = "James tiBeriUs kiRK";
        System.out.println("Full name is :" +s);
        System.out.println("Initials of name is :" );
        int len = s.length();
        s = s.trim();



        System.out.println("“1000” --> "+obj.binaryToDecimal(1000));
        System.out.println("10001 --> "+obj.binaryToDecimal(10001));
        System.out.println("111111 --> "+obj.binaryToDecimal(111111));
        System.out.println("1002 --> "+obj.binaryToDecimal(1002));



     // String  str = "naina";
       // obj.mostFrequent(str);

        //String str2 = "Vaibhavi";
        //obj.mostFrequent(str2);

        String str3 = "naina";
        obj.mostFrequent(str3);
    }


}
