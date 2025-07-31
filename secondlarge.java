import java.util.Arrays;
import java.util.Scanner;

public class secondlarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int large=arr[n-1];
        int second=-1;
        for(int i=n-2;i>=0;i--) {
            if(arr[i]!=large) {
                second=arr[i];
                break;
            }
        }
        if(second==-1) {
            System.out.println("no");
        }
        else {
             System.out.println(second);
        }
    }
}
    


    