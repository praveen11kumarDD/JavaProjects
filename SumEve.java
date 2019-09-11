import java.util.*;
public class SumEve {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int M=sc.nextInt();
	int N=sc.nextInt();
	int sum=0;
	for(int i=M;M<=N;M++)
	{  
	    if(M %2 == 0)
	    {
	        sum+=M;
            // sum=sum+M;
            System.out.println(M);
	    }
	}
     System.out.println("---------");
	 System.out.print(sum);
	

	}
}