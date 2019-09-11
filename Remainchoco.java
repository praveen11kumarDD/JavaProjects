import java.util.Scanner;
public class Remainchoco
{
    public static void main(String args[])
    {
        System.out.println("chocolate");
        System.out.println("children");
        System.out.println("remains");
        Scanner sc=new Scanner(System.in);
        int cho=sc.nextInt();
        int child=sc.nextInt();
        int noch=sc.nextInt();
        System.out.println("remain chocolates :"+(cho-(child*noch)));
    }
}