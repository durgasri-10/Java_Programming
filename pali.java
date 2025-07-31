import java.util.Scanner;
public class pali{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String original=str;
        String rev="";
        for(int i=0;i>=j;i++) {
            for(int j=str.length();j>=0;j--) {
                if(str.charAt(i)!=str.charAt(j)) {
                    System.out.println("not pali");
                    return;
                
                }
                
            }
        }

    }
}