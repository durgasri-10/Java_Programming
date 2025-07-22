import java.util.*;
class match{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int pc=0;
        if(str1.length()==str2.length()){
        for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)==str2.charAt(i))
                    pc++;
                else if(str1.charAt(i) == '?' || str2.charAt(i)=='?')
                    pc++;
        }
    }
        if(pc==str1.length()){
            System.out.print("yes");
        }
        else{
            System.out.print("No");
        }
    }
}