public class Supermarket {
    static String name="reliance mall";
    String pname;
    int price;
    int discount;

    Supermarket()
    {
        System.out.println("welcome");
    }
    Supermarket(String pname,int price,int discount){
        this.pname=pname;
        this.price=price;
        this.discount=discount;
    }
    
}
