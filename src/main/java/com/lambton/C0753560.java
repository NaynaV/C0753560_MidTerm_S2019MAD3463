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


        String str3 = "naina";

        int[] freq = new int[str3.length()];
        char minChar = str3.charAt(0), maxChar = str3.charAt(0);
        System.out.println("Name is :" +str3);
        System.out.println("Minimum occurring character: " + minChar);
//        System.out.println("Maximum occurring character: " + maxChar);

        String str4 = "Vaibhavi";
        int[] freq2 = new int[str4.length()];
        char minChar2 = str4.charAt(0), maxChar2 = str4.charAt(0);
        System.out.println("Name is :" +str4);

        System.out.println("Maximum occurring character: " + maxChar2);



        String str = "the dog jumped over the fence";
        System.out.println("String: "+str);
        obj.replaceSubString(str);

    }


}
