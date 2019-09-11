import java.util.Scanner;
public class Remain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cho=sc.nextInt();
        int child=sc.nextInt();
        int noch=sc.nextInt();
        System.out.println("chocolate"+cho);
        System.out.println("children"+child);
        System.out.println("remains"+noch);
        System.out.println("remain chocolates :"+(cho-(child*noch));
    }
}