import java.util.Scanner;
public class Position
{   public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=(n/10)%10;
    System.out.print(t);
  }
}