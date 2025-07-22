import java.util.Scanner;
public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int last;
        int original=num;
        while(num!=0) {
            last=num%10;
            rev=rev*10+last;
            num=num/10;         
        }
        System.out.println(rev);
    }
}