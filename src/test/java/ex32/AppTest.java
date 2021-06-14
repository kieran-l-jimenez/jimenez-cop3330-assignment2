package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void guessLow_1(){
        App myApp = new App();

        int answer = myApp.relativeGuess(10, 20);

        assertEquals(2, answer);
    }
    @Test
    public void guessLow_2(){
        App myApp = new App();

        int answer = myApp.relativeGuess(1, 1000);

        assertEquals(2, answer);
    }
    @Test
    public void guessHigh_1(){
        App myApp = new App();

        int answer = myApp.relativeGuess(45, 10);

        assertEquals(1, answer);
    }
    @Test
    public void guessHigh_2(){
        App myApp = new App();

        int answer = myApp.relativeGuess(545, 170);

        assertEquals(1, answer);
    }
    @Test
    public void guessEqual_1(){
        App myApp = new App();

        int answer = myApp.relativeGuess(545, 545);

        assertEquals(3, answer);
    }
    @Test
    public void guessEqual_2(){
        App myApp = new App();

        int answer = myApp.relativeGuess(45, 45);

        assertEquals(3, answer);
    }
}