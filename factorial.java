import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        long fact=1;
        for(long i=1;i<=num;i++) {
            fact=fact*i;
        }
        System.out.println(fact);

    }
}    