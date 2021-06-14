package ex33;

import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator,
you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later."

Example Output
What's your question?
> Will I be rich and famous?

Ask again later.
Constraint
The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a list and select one at random.
Challenges
Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        Random Rand = new Random();

        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};
        System.out.printf("What's your question?\n> ");
        String garbage = in.next();
        System.out.printf("\n%s", myApp.eightBallSays(responses, Rand.nextInt(4)));

    }

    String eightBallSays(String[] responses, int num)
    {
        return responses[num];
    }
}
