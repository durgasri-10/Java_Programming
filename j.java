import java.util.Scanner;
public class j{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();//10
        int b=sc.nextInt();//20
        int c=sc.nextInt();//30
        
        a = a + b + c; // a = 6
        b = a - (b + c); // b = 1
        c = a - (b + c); // c = 2
        a = a - (b + c); // a = 3
        
            System.out.println(a);//b
            System.out.println(b);//c
            System.out.println(c);//a
        }
    }
