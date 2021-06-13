package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.

Create a program that determines the complexity of a given password based on these rules:
-A very weak password contains only numbers and is fewer than eight characters.
-A weak password contains only letters and is fewer than eight characters.
-A strong password contains letters and at least one number and is at least eight characters.
-A very strong password contains letters, numbers, and special characters and is at least eight characters.

    Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.

    Constraints
-Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength.
Do not have the function return a string—you may need to support multiple languages in the future.
-Use a single output statement.

    Challenge
-Create a GUI application or web application that displays graphical feedback as well as text feedback in real time.
As someone enters a password, determine its strength and display the result
*/

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();
        String givenPassword;
        System.out.println("Enter Password:");
        givenPassword = in.next();
        System.out.printf("%s\n", myApp.output(myApp.passwordValidator(givenPassword), givenPassword));

    }

    private int passwordValidator(String givenPassword)
    {

        boolean numberPresent = false, moreThanEightInLength = false , letterPresent = false , specialCharPresent = false;

        char[] passwordArray = givenPassword.toCharArray();
        int length = givenPassword.length();

        if(length >= 8)
            moreThanEightInLength = true;

        for(int i = 0; i < length; i++)
        {
            if((passwordArray[i] >= 'a' && passwordArray[i] <= 'z') || (passwordArray[i] >= 'A' && passwordArray[i] <= 'Z'))
                letterPresent = true;
            else if(passwordArray[i] >= '0' && passwordArray[i] <= '9')
                numberPresent = true;
            else
                specialCharPresent = true;
        }

        if(!moreThanEightInLength)
        {
            if(numberPresent && !letterPresent && !specialCharPresent)
                return 1;//very weak
            else if(letterPresent && !numberPresent && !specialCharPresent)
                return 2;//weak
            else
                return 3;//medium
        }
        else
        {
            if(letterPresent && numberPresent && !specialCharPresent)
                return 4;//strong
            else if(letterPresent && numberPresent && specialCharPresent)
                return 5;//very strong
            else//catch for cases that don't fit in
                return -1;
        }
    }

    private String output(int selection, String password)
    {
        return switch (selection) {
            case 1 -> String.format("The password '%s' is a very weak password.", password);
            case 2 -> String.format("The password '%s' is a weak password.", password);
            case 3 -> String.format("The password '%s' is a medium password.", password);
            case 4 -> String.format("The password '%s' is a strong password.", password);
            case 5 -> String.format("The password '%s' is a very strong password.", password);
            default -> String.format("The password '%s' is a password of indeterminate strength.", password);
        };
    }
}
