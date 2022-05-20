import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMtest {
    ATM atm = new ATM();
    @Test
    public void test1(){
        assertEquals(atm.deposit(1000),"The 1000 deposit is Successful");
    }
    @Test
    public void test2(){
        assertEquals(atm.withdraw(900),"Transaction is Unsuccessful");
    }
    @Test
    public void test3(){
        assertEquals(atm.withdraw(2000),"Transaction is Successful");
    }
    @Test
    public void test4(){
        assertEquals(atm.getReceipt(),"Balance: 1000 ");
    }

}
