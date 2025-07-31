import java.util.Scanner;
public class aa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0,last;
        while(num>0) {
            last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        System.out.println(rev);
        if(rev==original) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
    
}