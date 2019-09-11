import java.util.Scanner;
public class TwoArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int score;
        int arr[][] = new int[r][c];
        r=arr[i].length;
        for(int i=0;i<r;i++)
        {
        score=0;
        for(int j=0;j<c;j++)
        {
            arr[i][j]=sc.nextInt();
            score+=arr[i][j];
        }
        System.out.println("over"+(i+1)+"score is"+score);
        }
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
}
