package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void removal_1() {
        App myApp = new App();
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        String[] answer = myApp.removeEmployee(employees, "John Smith");

        assertEquals("Jackie Jackson", answer[0]);
    }
    @Test
    public void removal_2() {
        App myApp = new App();
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        String[] answer = myApp.removeEmployee(employees, "Chris Jones");

        assertEquals("Amanda Cullen", answer[2]);
    }
    @Test
    public void removal_3() {
        App myApp = new App();
        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        String[] answer = myApp.removeEmployee(employees, "Jeremy Goodwin");

        assertEquals("Chris Jones", answer[2]);
    }
}