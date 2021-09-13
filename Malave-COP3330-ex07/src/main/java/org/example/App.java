package org.example;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Jose Malave
 */

public class App
{
    public static void main( String[] args )
    {
        final double convert = 0.09290304;
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the length of the room in feet? " );
        String length= sc.nextLine();
        System.out.println( "What is the width of the room in feet?" );
        String width= sc.nextLine();
        System.out.println( "You entered dimensions of "+length+" feet by "+width+" feet." );
        int i=Integer.parseInt(length);
        int y=Integer.parseInt(width);
        int f2 = (i * y);
        double m2 = (f2 * convert);
        System.out.println("The area is\n" +
                f2 +" square feet.\n" +
                m2 +  " square meters.");
    }
}