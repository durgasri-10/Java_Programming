import java.util.Scanner;
public class FactorialLength {
     int factorial(int n) {
    if(n==0||n==1) {
        return 1;
    }
    else {
        return n*factorial(n-1);
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    FactorialLength f=new FactorialLength(num);
    int res=f.factorial(num);
    System.out.println(res);
}
)