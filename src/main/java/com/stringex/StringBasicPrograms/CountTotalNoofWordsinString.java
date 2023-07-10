package com.stringex.StringBasicPrograms;

public class CountTotalNoofWordsinString {
    public static void main(String[] args) {

        String str="Hello welcome to the java world technology";
        char ch[]=str.toCharArray();
        int count=0;

        for (int i = 0; i < ch.length ; i++) {
            if (ch[i]==' ')
            {
                count++;
            }
        }
        System.out.println("Total no. of words in String is : "+(count+1));
    }
}
