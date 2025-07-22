import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] fre=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            fre[i]=-1;
        }
        for(int i=0;i<n;i++) {
            int count=1;
            if(fre[i]==-1) {
                for(int j=n-1;j<n;j++) {
                    if(a[i]==a[j]) {
                        count++;
                    }
                }
                fre[i]=count;
            }
     
        }
        for(int i=0;i<n;i++) {
            if(fre[i]!=0) {
                System.out.println(a[i] +"-" + fre[i]);
            }
        }

    }
}