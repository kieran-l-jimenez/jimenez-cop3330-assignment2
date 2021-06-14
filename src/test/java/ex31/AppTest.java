package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void karvonen_1()
    {
        App myApp = new App();

        double ans = myApp.calculateKarvonen(55, 22, 65);
        String answer = String.format("%.0f", ans);

        assertEquals("138", answer);
    }
    @Test
    public void karvonen_2()
    {
        App myApp = new App();

        double ans = myApp.calculateKarvonen(95, 22, 65);
        String answer = String.format("%.0f", ans);

        assertEquals("191", answer);
    }
}