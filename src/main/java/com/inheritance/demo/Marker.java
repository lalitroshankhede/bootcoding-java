package com.inheritance.demo;

public class Marker extends Pen {
    public void childMethod() {
        System.out.println("Calling Child Method");
    }

    public static void main(String[] args) {
        Marker mr = new Marker();
        Pen p = mr;
        Marker m = (Marker) p;
        mr.parentMethod();
        mr.childMethod();


    }
}
