package com.methodsex.methodVarargs;

public class VarArgsEx {


//    static int sum(int a,int b)
//    {
//        return a+b;
//    }
//    static int sum(int a,int b,int c)
//    {
//        return a+b+c;
//    }
//    static int sum(int a,int b,int c,int d)
//    {
//        return a+b+c+d;
//    }

    static int sum(int ...arr)
    {
        int result=0;
        for (int ele:arr) {
           result +=ele;
        }
       return result;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Two no "+sum());
        System.out.println("Sum of Two no "+sum(1));
        System.out.println("Sum of Two no "+sum(4,5));
        System.out.println("Sum of Two no "+sum(4,5,8));
        System.out.println("Sum of Two no "+sum(4,5,8,2));

    }
}
