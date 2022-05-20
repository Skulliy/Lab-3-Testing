public class ATM{

    public String deposit(int cash){
        return ("The " + cash + " deposit is Successful");
    }

    public String withdraw(int cash){
        if (cash > 1000) {
           return ("Transaction is Successful");
        }else{
            return ("Transaction is Unsuccessful");
        }
    }

    public String getReceipt(){
        return ("Balance: 1000 " );
    }


}
