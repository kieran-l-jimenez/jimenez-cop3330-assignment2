package ex24;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
    Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.

Create a program that compares two strings and determines if the two strings are anagrams.
The program should prompt for both input strings and display the output as shown in the example that follows.

    Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.

    Constraints
-Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false.
Invoke this function from your main program.
-Check that both words are the same length.

    Challenge
-Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.
    -A: Use getChars() and backtracking recursion to see if you can construct the second string
    - or check for first character in second string in the first, mark as used, repeat for next char
    - or convert to lowercase and sort, then compare String.equals (or skip conversion and use String.equalsIgnoreCase())

    Test Ideas
-isAnagram properly detecting anagrams, 4 cases (2 true, 2 false)
-results print correctly, 2 cases (1 true, 1 false)
*/
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();
        boolean anagramFlag = false;
        String[] words = myApp.grabInput();

        if(words[0].length() - words[1].length() == 0 && myApp.isAnagram(words[0], words[1]))
            anagramFlag = true;

        myApp.results(anagramFlag, words);
    }

    boolean isAnagram(String word_one, String word_two)
    {
        word_one =  word_one.toLowerCase();
        word_two = word_two.toLowerCase();
        char[] word_one_array = word_one.toCharArray();
        char[] word_two_array = word_two.toCharArray();
        int word_one_length = word_one.length();
        int word_two_length = word_two.length();
        int smallestIndex;
        char temp;

        for(int i = 0; i < word_one_length-1; i++)
        {
            smallestIndex = i;
            for(int j = i+1; j < word_one_length; j++)
            {
                if(word_one_array[smallestIndex] > word_one_array[j])
                    smallestIndex = j;
            }
            temp = word_one_array[i];
            word_one_array[i] = word_one_array[smallestIndex];
            word_one_array[smallestIndex] = temp;
        }

        for(int i = 0; i < word_two_length-1; i++)
        {
            smallestIndex = i;
            for(int j = i+1; j < word_two_length; j++)
            {
                if(word_two_array[smallestIndex] > word_two_array[j])
                    smallestIndex = j;
            }
            temp = word_two_array[i];
            word_two_array[i] = word_two_array[smallestIndex];
            word_two_array[smallestIndex] = temp;
        }
        boolean result;

        result = String.valueOf(word_one_array).equals(String.valueOf(word_two_array));

        return result;
    }

    private String[] grabInput()
    {
        String[] words = new String[2];
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        words[0] = in.next();
        System.out.print("Enter the second string: ");
        words[1] = in.next();

        return words;
    }

    private void results(boolean flag, String[] words)
    {
        if(flag)
            System.out.printf("\"%s\" and \"%s\" are anagrams.\n", words[0], words[1]);
        else
            System.out.printf("\"%s\" and \"%s\" are not anagrams.\n", words[0], words[1]);
    }
}
