import java.util.Scanner;
public class swapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");//10
        int a=sc.nextInt();
        System.out.println("Ente b value");//20
        int b=sc.nextInt();
        System.out.println("Enter c value");//30
        int c=sc.nextInt();

        a=c-a;//20
        c=c-a;//10
        b=a+c;
        System.out.println("value of a-"+a);//a=b
        System.out.println("vale of b -"+b);//b=c
        System.out.println("value of c-"+c);//c=a
    }
}
