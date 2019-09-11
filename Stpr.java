import java.util.Scanner;
public class Stpr
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String st=sc.nextLine().toUpperCase();
      char ch=st.charAt(0);
      for(char c=1;c<=ch;c++)
      {
          System.out.println(c);
      }
    }
}