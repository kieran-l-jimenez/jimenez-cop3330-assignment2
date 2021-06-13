package ex27;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 27 - Validating Inputs
Large functions aren’t very usable or maintainable. It makes a lot of sense to break down the logic of a program into smaller functions that do one thing each.
The program can then call these functions in sequence to perform the work.
Write a program that prompts for a first name, last name, employee ID, and ZIP code. Ensure that the input is valid according to these rules:

The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.
Display appropriate error messages on incorrect data.

    Example Output
Enter the first name: J
Enter the last name:
Enter the ZIP code: ABCDE
Enter the employee ID: A12-1234
The first name must be at least 2 characters long.
The last name must be at least 2 characters long.
The last name must be filled in.
The employee ID must be in the format of AA-1234.
The zipcode must be a 5 digit number.
            Or
Enter the first name: John
Enter the last name: Johnson
Enter the ZIP code: 55555
Enter the employee ID: TK-4321
There were no errors found.

    Constraints
-Create a function for each type of validation you need to write.
Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
-Use a single output statement to display the outputs.

    Challenges
-Use regular expressions to validate the input.
-Implement this as a GUI application or web application that gives immediate feedback when the fields lose focus.
-Repeat the process if the input is not valid.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();
        Employee myEmployee = new Employee();

        System.out.print("Enter the first name: ");
        myEmployee.firstName = in.next();
        System.out.print("Enter the last name: ");
        myEmployee.lastName = in.next();
        System.out.print("Enter the ZIP code: ");
        myEmployee.zipCode = in.next();
        System.out.print("Enter the employee ID: ");
        myEmployee.employeeID = in.next();

        System.out.print(myApp.validateInputs(myEmployee, myApp));
    }

    String validateInputs(Employee myEmployee, App myApp) {
        String output = "";
        boolean fnameLength = myApp.NameVerifyLength(myEmployee.firstName);
        boolean fnameFilled = myApp.NameVerifyFilled(myEmployee.lastName);
        boolean lnameFilled = myApp.NameVerifyFilled(myEmployee.firstName);
        boolean lnameLength = myApp.NameVerifyLength(myEmployee.lastName);
        boolean zip = myApp.ZipVerify(myEmployee.zipCode);
        boolean id = myApp.IDVerify(myEmployee.employeeID);
        if(fnameLength && fnameFilled && lnameLength && lnameFilled && zip && id)
            output = "There were no errors found.\n";
        else
        {
            if(!fnameLength)
                output = output.concat("The first name must be at least 2 characters long.\n");
            if(!fnameFilled)
                output = output.concat("The first name must be filled in.\n");
            if(!lnameLength)
                output = output.concat("The last name must be at least 2 characters long.\n");
            if(!lnameFilled)
                output = output.concat("The last name must be filled in.\n");
            if(!id)
                output = output.concat("The employee ID must be in the format of AA-1234.\n");
            if(!zip)
                output = output.concat("The zipcode must be a 5 digit number.\n");
        }
        return output;
    }

    boolean NameVerifyFilled(String name) {
        return name.length() != 0;
    }

    boolean NameVerifyLength(String name) {
        return name.length() >= 2;
    }
    boolean ZipVerify(String zip) {
        return Pattern.matches("[0-9][0-9][0-9][0-9][0-9]", zip);
    }
    boolean IDVerify(String ID) {
        return Pattern.matches("[a-zA-Z][a-zA-Z]-[0-9][0-9][0-9][0-9]", ID);
    }
}
