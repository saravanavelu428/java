public class Ticketbooking{
    public static void main(String[] args) {
        Ticketbooking tb=new Ticketbooking();
        System.out.println(tb.Test(65));
    }
    public boolean Test(int amount){
        if(amount>60){
            return true;
        }else{
            return false;
        }
        }

    }

