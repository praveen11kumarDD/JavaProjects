import java.util.Scanner;
public class Basicmaths
{
    public static void printString(String a){
        System.out.println(a);
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int maths=4;
        for(int i=1;i<=maths;i++)
        {
            int ans = 0;
            String operation ="";
        switch(i)
        {
            case 1:
               ans=n1+n2;
               operation = "sum";
                break;
            case 2:
               ans=n1-n2;
                operation = "sub";
                break;
            case 3:
                ans=n1*n2;
                operation = "multiply";
                break;
            case 4:
                ans=n2/n1;
                operation = "division";
                break;
        }
                printString(operation+" of numbers :"+ans);
        }          

    }
}