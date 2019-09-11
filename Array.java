import java.util.Scanner;
public class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your Array: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}