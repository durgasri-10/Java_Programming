import java.util.Scanner;
public class reverse_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int last=0;
        String s="";
        while(num!=0) {
            last=num%10;
            s=s+Integer.toString(last);
            num=num/10;         
        }
        System.out.println(s);
    }
}