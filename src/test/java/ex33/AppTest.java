package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void response_1(){
        App myApp = new App();
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};

        String answer = myApp.eightBallSays(responses, 0);

        assertEquals("Yes.", answer);
    }
    @Test
    public void response_2(){
        App myApp = new App();
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};

        String answer = myApp.eightBallSays(responses, 1);

        assertEquals("No.", answer);
    }
    @Test
    public void response_3(){
        App myApp = new App();
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};

        String answer = myApp.eightBallSays(responses, 2);

        assertEquals("Maybe.", answer);
    }
    @Test
    public void response_4(){
        App myApp = new App();
        String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};

        String answer = myApp.eightBallSays(responses, 3);

        assertEquals("Ask again later.", answer);
    }
}