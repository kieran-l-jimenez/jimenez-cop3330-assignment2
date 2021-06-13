package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void NameFilled_true(){
        App myApp27 = new App();

        boolean answer = myApp27.NameVerifyFilled("a");

        assertTrue(answer);
    }
    @Test
    public void NameFilled_false(){
        App myApp27 = new App();

        boolean answer = myApp27.NameVerifyFilled("");

        assertFalse(answer);
    }
    @Test
    public void NameLength_true(){
        App myApp27 = new App();

        boolean answer = myApp27.NameVerifyLength("ab");

        assertTrue(answer);
    }
    @Test
    public void NameLength_false(){
        App myApp27 = new App();

        boolean answer = myApp27.NameVerifyLength("a");

        assertFalse(answer);
    }
    @Test
    public void Zip_true(){
        App myApp27 = new App();

        boolean answer = myApp27.ZipVerify("55555");

        assertTrue(answer);
    }
    @Test
    public void Zip_false(){
        App myApp27 = new App();

        boolean answer = myApp27.ZipVerify("333a");

        assertFalse(answer);
    }
    @Test
    public void ID_true(){
        App myApp27 = new App();

        boolean answer = myApp27.IDVerify("ab-1234");

        assertTrue(answer);
    }
    @Test
    public void ID_false(){
        App myApp27 = new App();

        boolean answer = myApp27.IDVerify("a3-1glhf4");

        assertFalse(answer);
    }

}