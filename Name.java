import java.util.Scanner;
public class Name
{
  public static void main(String args[])
  {

     // Ramalinga
    //  012345678
    // 9
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      for(int i =0; i<str.length() ;i++)
      {
          if(str.charAt(i) != ' '){
          System.out.println(str.charAt(i));

          }
      }
  }
}