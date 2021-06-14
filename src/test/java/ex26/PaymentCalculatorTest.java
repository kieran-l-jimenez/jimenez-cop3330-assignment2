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
    @Test
    public void calculateMonthsUntilPaidOff_30(){
        PaymentCalculator myPC = new PaymentCalculator();
        UserInfo myUser = new UserInfo();
        myUser.APR = 18;
        myUser.Balance = 3000;
        myUser.monthlyPayment = 125;

        double answer = myPC.calculateMonthsUntilPaidOff(myUser);

        assertEquals(30, answer);
    }
    @Test
    public void calculateMonthsUntilPaidOff_28(){
        PaymentCalculator myPC = new PaymentCalculator();
        UserInfo myUser = new UserInfo();
        myUser.APR = 21;
        myUser.Balance = 4000;
        myUser.monthlyPayment = 180;

        double answer = myPC.calculateMonthsUntilPaidOff(myUser);

        assertEquals(28, answer);
    }
}