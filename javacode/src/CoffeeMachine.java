
public class CoffeeMachine {
    public static String dispense(){
        return "Coffee is being dispensed";
    }
    public static String takemoney(int n){
        System.out.println("Please insert your money \n The options are \n 1)5 pounds \n 2) 10 pounds \n 3) 15 pounds");
        if (n < 5) return "Not enough money";
        else return dispense();
    }

}
