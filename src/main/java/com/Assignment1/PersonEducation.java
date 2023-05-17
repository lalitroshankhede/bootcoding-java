package com.Assignment1;

public class PersonEducation {

    public static void main(String[] args) {

        int studAge=17;

        if (studAge<5)
        {
            System.out.println("Nursery");
        } else if (studAge>5 && studAge<15) {
            System.out.println("K10");
        } else if (studAge>16 && studAge<18) {
            System.out.println("K12");
        } else if (studAge>19 && studAge<22) {
            System.out.println("Graduate");
        }
        else
        {
            System.out.println("Student age is out of criteria");
        }
    }
}

