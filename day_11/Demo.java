 class Calculator {
    int num=10;//global variable,instance variable,fields,non-static vvariable
    int add(int a,int b)
    {
        return a+b;
    }
    
}

public class Demo {
    public static void main(String[] args) {
        int data=10;
        Calculator c=new Calculator();
        Calculator c1=new Calculator();
        c.num=20;
        System.out.println(c.num);
        System.out.println(c1.num);
        



    }
    

}


