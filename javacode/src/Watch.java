import java.time.LocalTime;

public class Watch {

    public static String displaytime(){
        return "time is " + LocalTime.now().toSecondOfDay();
    }
    public static String adjusttime(String t){
        System.out.println("Please input the new time ");
        return"new time is " + t;
    }
}
