import java.util.*;
class sri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0) 
        {
          System.out.println(year);
        }
        else {
            System.out.println("not a leap year");

        }
       
    }
}