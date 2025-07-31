import java.util.Scanner;
public class revarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        int[] rev=new int[n];
        for(int i=n-1;i>=0;i--) {
            rev[i]=arr[n-i-1];
        }
        for(int i=0;i<n;i++) {
        System.out.print(rev[i]+" ");
        }
    }
}