package com.stringex.StringBasicPrograms;

public class CalculateTotalPuncatuationinString {
    public static void main(String[] args) {

        String str="He said,'The mailman loves you.' I heard it with my own ears.";
        int count = 0;
        char ch[]=str.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if(ch[i] == '!' || ch[i]  == ',' || ch[i]  == ';' || ch[i]  == '.' ||  ch[i]  == '?' || ch[i]  == '-' ||
                    ch[i]  == '\'' || ch[i]  == '\"' || ch[i]  == ':'){
               
                count++;
            }
        }
        System.out.println("The Total No. of Puntuation in given String is : "+count);
        
    }
}
