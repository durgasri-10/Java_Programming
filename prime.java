import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        if(num<=0) {
            System.out.println("not a prime number");
        }
        else {
            for(int i=2;i<num;i++) {
                if(num%i==0) {
                    count=1;
                    break;
                }
            }
            if(count==0) {
                System.out.println("prime number");
            }
            else {
                System.out.println("not a prime number");
            }
        }
    }
}