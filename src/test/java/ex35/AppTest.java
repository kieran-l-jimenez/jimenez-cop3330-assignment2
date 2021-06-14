package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void winner_1(){
        ex35.App myApp = new ex35.App();

        ArrayList<String> contenders = new ArrayList<>();
        contenders.add("Homer");
        contenders.add("Bart");
        contenders.add("Maggie");
        contenders.add("Lisa");
        String answer = myApp.findWinner(contenders, 0);

        assertEquals("Homer", answer);
    }
    @Test
    public void winner_2(){
        ex35.App myApp = new ex35.App();

        ArrayList<String> contenders = new ArrayList<>();
        contenders.add("Homer");
        contenders.add("Bart");
        contenders.add("Maggie");
        contenders.add("Lisa");
        String answer = myApp.findWinner(contenders, 1);

        assertEquals("Bart", answer);
    }
    @Test
    public void winner_3(){
        ex35.App myApp = new ex35.App();

        ArrayList<String> contenders = new ArrayList<>();
        contenders.add("Homer");
        contenders.add("Bart");
        contenders.add("Maggie");
        contenders.add("Lisa");
        String answer = myApp.findWinner(contenders, 3);

        assertEquals("Lisa", answer);
    }
}