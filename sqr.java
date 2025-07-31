import java.util.Scanner;
public class sqr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if(number<0) {
            System.out.println("not define");
        }
        else {
            int start=0,end=number,ans=0;
            while(start<=end) {
                int mid=(start+end)/2;
                if(mid*mid==number) {
                    ans=mid;
                    break;
                }
                if(mid*mid<number) {
                        start=mid+1;
                        ans=mid;
                }
                else {
                        end=mid-1;
                    }
                }
                 System.out.println(ans);
            }
            
        
        }
    }


        