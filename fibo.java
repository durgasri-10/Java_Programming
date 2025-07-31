import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int first=0;
        int second=1;
        int next;
        System.out.print(first+","+second+",");     
        for(int i=2;i<n;i++) {
            next=first+second;
            first=second;
            second=next; 
            System.out.print(next+",");    
        }
         
    }
}