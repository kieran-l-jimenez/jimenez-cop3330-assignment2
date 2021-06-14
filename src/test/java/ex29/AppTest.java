package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void calculation_1(){
        App myApp = new App();

        double answer = myApp.calculation(4);

        assertEquals(18, answer);
    }
    @Test
    public void calculation_2(){
        App myApp = new App();

        double answer = myApp.calculation(12);

        assertEquals(6, answer);
    }
    @Test
    public void calculation_3(){
        App myApp = new App();

        double answer = myApp.calculation(3.65);

        assertEquals(20, answer);
    }
    @Test
    public void calculation_4(){
        App myApp = new App();

        double answer = myApp.calculation(5);

        assertEquals(15, answer);
    }
}