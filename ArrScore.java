import java.util.Scanner;
public class ArrScore
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int score=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          score+=a[i];
        }
        for(i=0;i<n;i++)
        {
        System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(score);
    }
} 