package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void isAnagram_returns_true_1(){
        App myApp24 = new App();

        boolean answer = myApp24.isAnagram("Tone", "Note");

        assertTrue(answer);
    }
    @Test
    public void isAnagram_returns_true_2(){
        App myApp24 = new App();

        boolean answer = myApp24.isAnagram("race car", "car race");

        assertTrue(answer);
    }
    @Test
    public void isAnagram_returns_false_1(){
        App myApp24 = new App();

        boolean answer = myApp24.isAnagram("jingoism", "password");

        assertFalse(answer);
    }
    @Test
    public void isAnagram_returns_false_2(){
        App myApp24 = new App();

        boolean answer = myApp24.isAnagram("dog", "Ice Cream");

        assertFalse(answer);
    }
}