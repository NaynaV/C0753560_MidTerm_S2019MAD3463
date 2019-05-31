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


    public void initials(String s)
    {

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

    //Q:4 MostFrequent

    public void mostFrequent(String str)
    {


        int i, j, min, max;
        int[] freq = new int[str.length()];
        char minChar = str.charAt(0);
        char maxChar = str. charAt(0);


        char string[] = str.toCharArray();


        for(i = 0; i < string.length; i++)
        {
            freq[i] = 1;
            for(j = i+1; j < string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0')
                {
                    freq[i]++;


                    string[j] = '0';
                }
            }
        }


                min = max = freq[0];
        for(i = 0; i <freq.length; i++) {

                    if(min > freq[i] && freq[i] != '0')
                    {
                min = freq[i];
                minChar = string[i];
            }

            if(max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }


    }

    }

