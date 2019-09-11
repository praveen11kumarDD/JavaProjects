import java.util.Scanner;
public class Maximum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i] =in.nextInt();
        }
        int max = a[0];
        for(int i=1;i<=n-1;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        // System.out.println(max);
        System.out.println("Max is : "+max);

        //for printing
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]);
        // }

        //for multidimensional array
        // int a1[][]=new int[4][];
        // a1[0] = new int [2];
        // a1[1] = new int [3];
        
    }
}