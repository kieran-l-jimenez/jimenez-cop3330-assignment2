package ex38;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 38 - Filtering Values
Sometimes input you collect will need to be filtered down. Data structures and loops can make this process easier.

Create a program that prompts for a list of numbers, separated by spaces. Have the program print out a new list containing
only the even numbers.

    Example Output
Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
The even numbers are 2 4 6 8.
    Constraints
Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function that splits
apart a string based on a specified delimiter.
Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
Use a function called filterEvenNumbers to encapsulate the logic for this. The function takes in the old array and returns the new array.
Challenge
Instead of prompting for numbers, read in lines from any text file and print out only the even-numbered lines.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String firstLine;
        System.out.print("Enter a list of numbers, separated by spaces: ");
        firstLine = in.nextLine();
        String[] fLineArr = firstLine.split(" ");
        int size = fLineArr.length;
        int[] fLineInts = new int[size];

        for(int i = 0; i < size; i++)
        {
            fLineInts[i] = parseInt(fLineArr[i]);
        }
        int[] filtered = myApp.filterEvenNumbers(fLineInts, size);

        System.out.print("The even numbers are ");
        for(int i = 0; i < filtered.length; i++)
        {
            if(i == filtered.length-1 || filtered[i+1] == 0)
            {
                System.out.printf("%d.", filtered[i]);
                break;
            }
            System.out.printf("%d ", filtered[i]);
        }
    }
    int[] filterEvenNumbers(int[] arr, int size)
    {
        int[] temp = new int[size];
        int index = 0;
        for(int i = 0; i < size; i++)
        {
            if(arr[i]%2 == 0)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        return temp;
    }
}
