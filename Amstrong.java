import java.util.Scanner;
import java.lang.Math;
public class Amstrong{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int actual = n;
        int toFindLength = n;
        int len =0;

        while(toFindLength!=0){
            toFindLength/=10;
            len++;
        }
        int remain=0;
        int result=0;
        while(n!=0)
        {
            remain=n%10;
            n=n/10;
            result += (int)Math.pow(remain,len);
        }
    if(result == actual){
        System.out.println("Armstrong number");

    }
    else{
        System.out.println("Not an armstrong number");
    } 
    }

}