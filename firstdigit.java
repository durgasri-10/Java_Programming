import java.util.Scanner;
public class firstdigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s=Integer.toString(num);
        char ch=s.charAt(0);
        System.out.println(ch);
    }
}