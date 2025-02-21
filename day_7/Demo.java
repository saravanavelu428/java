public class Demo {
    static{
        System.out.println("hello world fr0m static block");
    }
    {
        System.out.println("hello world from non-static block-1");

    }
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo();
    }
    }
    
    

