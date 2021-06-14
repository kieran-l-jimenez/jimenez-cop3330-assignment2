package ex36;

import java.util.ArrayList;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 36 - Computing Statistics
Statistics is important in our field. When measuring response times or rendering times, it’s helpful to collect data so
you can easily spot abnormalities. For example, the standard deviation helps you determine which values are outliers and
which values are within normal ranges.

Write a program that prompts for response times from a website in milliseconds. It should keep asking for values until
the user enters “done.”

The program should print the average time (mean), the minimum time, the maximum time, and the population standard deviation.

    Example Output
Enter a number: 100
Enter a number: 200
Enter a number: 1000
Enter a number: 300
Enter a number: done
Numbers: 100, 200, 1000, 300
The average is 400.0
The minimum is 100
The maximum is 1000
The standard deviation is 353.55

    Constraints
Use functions called average, max, min, and std, which take in a list of numbers and return the results.
Use loops and arrays to perform the input and mathematical operations.
Be sure to exclude the "done" entry from the inputs.
Be sure to properly ignore any invalid inputs.
Keep the input separate from the processing and the output.
    Challenges
Have the program read in numbers from an external file instead of prompting for the values.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        ArrayList<Integer> responseTimes = myApp.input();
        int size = responseTimes.size();

        System.out.print("Numbers: ");
        for(int i = 0; i < size; i++)
        {
            if(i == size - 1)
            {
                System.out.printf("%d\n", responseTimes.get(i));
                break;
            }
            System.out.printf("%d, ", responseTimes.get(i));
        }
        System.out.printf("The average is %.1f\n", myApp.average(responseTimes));
        System.out.printf("The minimum is %d\n", myApp.min(responseTimes));
        System.out.printf("The maximum is %d\n", myApp.max(responseTimes));
        System.out.printf("The standard deviation is %.2f\n", myApp.std(responseTimes, myApp.average(responseTimes)));

    }

    double std(ArrayList<Integer> responseTimes, double average) {
        int size = responseTimes.size();
        double result = 0;
        for (Integer responseTime : responseTimes) {
            result += Math.pow(responseTime - average, 2);
        }
        result = result / size;

        return Math.sqrt(result);
    }

    private int min(ArrayList<Integer> responseTimes) {
        int smallIndex = 0;
        int size = responseTimes.size();

        for(int i = 1; i < size; i++)
        {
            if(responseTimes.get(smallIndex) > responseTimes.get(i))
                smallIndex = i;
        }
        return responseTimes.get(smallIndex);
    }

    private int max(ArrayList<Integer> responseTimes) {
        int bigIndex = 0;
        int size = responseTimes.size();

        for(int i = 1; i < size; i++)
        {
            if(responseTimes.get(bigIndex) < responseTimes.get(i))
                bigIndex = i;
        }
        return responseTimes.get(bigIndex);
    }

    private double average(ArrayList<Integer> responseTimes) {
        double mean = 0;
        int size = responseTimes.size();

        for (Integer responseTime : responseTimes) {
            mean = mean + responseTime;
        }
        return mean/size;
    }

    private ArrayList<Integer> input() {
        ArrayList<Integer> resultArr = new ArrayList<>();
        String temp;

        while(true)
        {
            System.out.print("Enter a number: ");
            temp = in.next();
            if(temp.equals("done"))
                break;
            resultArr.add(Integer.parseInt(temp));
        }

        resultArr.trimToSize();

        return resultArr;
    }
}
