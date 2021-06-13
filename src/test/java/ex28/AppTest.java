package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void finalString_1(){
        App myApp = new App();

        String answer = myApp.totalString(15);

        assertEquals("The total is 15", answer);
    }
    @Test
    public void finalString_2(){
        App myApp = new App();

        String answer = myApp.totalString(36);

        assertEquals("The total is 36", answer);
    }
}