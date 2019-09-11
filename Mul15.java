import java.util.*;
public class Mul15 {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Start=sc.nextInt();
	int end=sc.nextInt();
	int mul=Start;
	for(int i=mul;i<=end;i++)
	{
	    if(mul%15==0)
	    {
	    System.out.println(i);
	    }
	}
	

	}
}