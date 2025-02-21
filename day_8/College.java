package tamilnadu.chennai;
public class College {
    static String clgname="DACE";
    int fees=20000;

    public static void main(String[] args) {
        display();
        College clg=new College();
        clg.studying();
        
    }
    static void display()
    {
        System.out.println("welcome to college"+clgname);

    }
    
    void studying()
    
    {
        System.out.println("student are studying");
    }
    void write()
    {
        System.out.println("");
    }
    
}
