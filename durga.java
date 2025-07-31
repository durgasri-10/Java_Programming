import java.util.Scanner;
import java.util.Arrays;

public class Durga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+",");
        }
        System.out.println();

        int max = ar[n - 1];
        int secMax = ar[n - 2];
        int min = ar[0];
        int secMin = ar[1];

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secMax);
        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + secMin);
    }
}
