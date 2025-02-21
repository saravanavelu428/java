public class Exceptiondemo {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        try{
        System.out.println(a/b);
    }
    catch(ArithmeticException abc)
    {
        System.out.println("check b value");
    }
    System.out.println("hi");
    
}
}