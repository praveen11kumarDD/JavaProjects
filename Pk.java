import java.util.Scanner;
public class Pkmulti
{
 public static void main(String args[])
   { 
     Scanner pk=new Scanner(System.in);
     System.out.print("enter the number");
     int n=pk.nextInt();
     for(int i=1;i<=10;i++)
     {
       System.out.println(n +"*" +i+"="+n*i);
      }
}
}