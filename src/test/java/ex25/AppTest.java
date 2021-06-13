package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void passwordValidator_veryWeak()
    {
        ex25.App myApp25 = new App();

        int answer = myApp25.passwordValidator("12345");

        assertEquals(1, answer);

    }
    @Test
    public void passwordValidator_Weak()
    {
        ex25.App myApp25 = new App();

        int answer = myApp25.passwordValidator("abcdef");

        assertEquals(2, answer);

    }
    @Test
    public void passwordValidator_strong()
    {
        ex25.App myApp25 = new App();

        int answer = myApp25.passwordValidator("abc123xyz");

        assertEquals(4, answer);

    }
    @Test
    public void passwordValidator_veryStrong()
    {
        ex25.App myApp25 = new App();

        int answer = myApp25.passwordValidator("1337h@xor!");

        assertEquals(5, answer);

    }
}