package com.lambton;

public class LambtonStringTools {
    //Q:1 Reverse String Coding
    public void ReverseString(String str) {
        String[] words = str.split(" ");

        String reversedString = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";

        }

        System.out.println(str);
        System.out.println(reversedString);
    }

    // Q:2 binaryToDecimal

    public int binaryToDecimal(int binaryNumber) {

        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber / 10;
                p++;
            }
        }
        return decimal;
    }


//Q:3 Initials


    public void initials(String s) {

        int len = s.length();
        s = s.trim();
        String str1 = "";
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                str1 = str1 + ch;
            } else {
                System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j = 0; j < str1.length(); j++) {
            if (j == 0)
                str2 = str2 + Character.toUpperCase(str1.charAt(0));
            else
                str2 = str2 + Character.toLowerCase(str1.charAt(j));
        }
        System.out.println(str2);
    }


    public char mostFrequent(String str)
    {
        int counter[] = new int[256];

        int len = str.length();

        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;


        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {


                if (str.charAt(i) == array[j])
                    flag++;
            }

            if (flag == 1) {
                System.out.println("Occurrence of char " + str.charAt(i)
                        + " in the String is:" + counter[str.charAt(i)]);
            }


        }

    }
}