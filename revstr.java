import java.util.Scanner;
public class revstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String original=str;
        String rev="";
        for(int i=str.length()-1;i>=0;i--) {
            char ch=str.charAt(i);
            rev+=ch;
        }
        System.out.println(rev);
        if(rev.equals(original)) {
            System.out.println("palindrome");

        }
        else {
            System.out.println("not a palindrome");

        }
    }
}