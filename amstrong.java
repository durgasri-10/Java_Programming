import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            int original=num;
            int sum=0;
            int dig;
            while(num>0) {
                dig=num%10;
                sum+=dig*dig*dig;
                num=num/10;
          }
        if(sum==original) {
            System.out.println(original+" - "+"Amstrong number");
        }
        else {
            System.out.println(original+"not a amstrong number");
        }
    }
}