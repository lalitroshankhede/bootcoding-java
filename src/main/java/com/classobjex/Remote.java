package com.classobjex;

public class Remote {

    int totalButtons;
    double price;

    public void printRemoteInfo()
    {
        System.out.println("Total Buttons :"+totalButtons);
        System.out.println("Price :"+price);
    }


    public static void main(String[] args) {
        /*Object 1*/
        Remote remote1=new Remote();
        remote1.totalButtons=20;
        remote1.price=100.52;

        /*Object 2*/
        Remote remote2=new Remote();
        remote2.totalButtons=30;
        remote2.price=110.52;

        /*Object 3*/
        Remote remote3=new Remote();
        remote3.totalButtons=40;
        remote3.price=120.52;

        /*Object 4*/
        Remote remote4=new Remote();
        remote4.totalButtons=50;
        remote4.price=130.52;

        /*Object 5*/
        Remote remote5=new Remote();
        remote5.totalButtons=20;
        remote5.price=100.52;

        /*Calling printRemoteInfo()*/
        remote1.printRemoteInfo();
        remote2.printRemoteInfo();
        remote3.printRemoteInfo();
        remote4.printRemoteInfo();
        remote5.printRemoteInfo();


    }
}
