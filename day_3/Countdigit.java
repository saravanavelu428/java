import java.util.*;
public class Countdigit {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=get.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;

            }
        }
        System.out.println(count);
        }
}
