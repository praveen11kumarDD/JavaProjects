import java.util.Scanner;
public class Multi{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int multiplicator=sc.nextInt();
    int no=sc.nextInt();
    for(int no1=no;no1>=1;no1--)
    {
        System.out.println(no1+"*"+multiplicator+"="+(no1*multiplicator));
    }

}}