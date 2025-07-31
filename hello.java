import java.util.Scanner;
public class hello {
    public static int factorial(int n) {
        if(n==1||n==0) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=factorial(num);
        System.out.println("factorial of"+num+"is"+res);
    }
}