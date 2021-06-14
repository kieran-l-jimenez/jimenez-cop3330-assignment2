package ex34;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 34 - Employee List Removal
Sometimes you have to locate and remove an entry from a list based on some criteria. You may have a deck of cards and
need to discard one so it’s no longer in play, or you may need to remove values from a list of valid inputs once they’ve
been used. Storing the values in an array makes this process easier. Depending on your language, you may find it safer
and more efficient to create a new array instead of modifying the existing one.

Create a small program that contains a list of employee names. Print out the list of names when the program runs the
first time. Prompt for an employee name and remove that specific name from the list of names. Display the remaining
employees, each on its own line.

    Example Output
There are 5 employees:
John Smith
Jackie Jackson
Chris Jones
Amanda Cullen
Jeremy Goodwin

Enter an employee name to remove: Chris Jones

There are 4 employees:
John Smith
Jackie Jackson
Amanda Cullen
Jeremy Goodwin

    Constraint
Use an array or list to store the names.
    Challenges
If the user enters a name that’s not found, print out an error message stating that the name does not exist.
Read in the list of employees from a file, with each employee on its own line.
Write the output to the same file you read in.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.println("There are 5 employees:");
        for(int i = 0; i < 5; i++)
            System.out.printf("%s\n", employees[i]);

        System.out.printf("\nEnter an employee name to remove: ");
        String target = in.nextLine();

        employees = myApp.removeEmployee(employees, target);

        System.out.println("\nThere are 4 employees:");
        for(int i = 0; i < 4; i++)
            System.out.printf("%s\n", employees[i]);
    }

    String[] removeEmployee(String[] roster, String target)
    {
        String[] temp = new String[4];
        int tempIndex = 0;
        for(int i = 0; i < 5; i++)
        {
            if(target.equals(roster[i]))
                continue;
            temp[tempIndex] = roster[i];
            tempIndex++;
        }
        return temp;
    }
}
