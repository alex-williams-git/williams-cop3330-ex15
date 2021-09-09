/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the password? ");
        String user_input = scan.nextLine();

        String stored_pass = "abc$123";

        if(user_input.equals(stored_pass)){
            System.out.println("Welcome!");
        }else{
            System.out.println("I don't know you.");
        }
    }
}
