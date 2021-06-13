package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    public void calculateMonthsUntilPaidOff_70(){
        PaymentCalculator myPC = new PaymentCalculator();
        UserInfo myUser = new UserInfo();
        myUser.APR = 12;
        myUser.Balance = 5000;
        myUser.monthlyPayment = 100;

        double answer = myPC.calculateMonthsUntilPaidOff(myUser);

        assertEquals(70, answer);
    }
}