import java.util.Scanner;
public class largedig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int large=0;
        while(num>0) {
            int dig=num%10;
            if(dig>large) {
                large=dig;
            }
            num=num/10;
        }
        System.out.println(large);
    }
}