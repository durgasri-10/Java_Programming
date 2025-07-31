import java.util.Scanner;
public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        for(int i=2;i<=num;i++) {
            next=first+second;
            first=second;
            second=next;
            System.out.println(next);
        }
    }
}