package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void tableOneByOne(){
        App myApp = new App();

        String answer = myApp.tableGenerator(1,1);

        assertEquals("    1\n", answer);
    }
    @Test
    public void tableFourByFour(){
        App myApp = new App();

        String answer = myApp.tableGenerator(4,4);

        assertEquals("    1    2    3    4\n    2    4    6    8\n    3    6    9   12\n    4    8   12   16\n", answer);
    }
}