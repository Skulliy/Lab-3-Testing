import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeTest {
    CoffeeMachine machine = new CoffeeMachine();
    @Test
    public void test1(){
        assertEquals(machine.dispense(), "Coffee is being dispensed");
    }
    @Test
    public void test2(){
        assertEquals(machine.takemoney(5),"Coffee is being dispensed");
    }
    @Test
    public void test3(){
        assertEquals(machine.takemoney(3),"Not enough money");
    }
}

