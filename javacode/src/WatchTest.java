import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
public class WatchTest {
    Watch watch = new Watch();
    @Test
    public void test1(){
        assertEquals(watch.displaytime(),"time is " + LocalTime.now().toSecondOfDay());
    }
    @Test
    public void test2(){
        assertEquals(watch.adjusttime("22:20"), "new time is 22:20");
    }
}
