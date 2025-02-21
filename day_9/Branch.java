public class Branch {
    Branch(){
        System.out.println("welcome to branch");
    }
    public static void main(String[] args) {
        Branch bo=new Branch();
        bo.celebrate();
    }
    void celebrate(){
        System.out.println("local function");
    }
    
}
