// import java.util.Scanner;
// public class Sample
// {
// public static void main(String args[])
// {
//     Scanner sc=new Scanner(System.in);
// //     int n=sc.nextInt();
// //     int a[]=new int[n];
// //     for(int i=0;i<n;i++)
// //     {
// //         a[i]=sc.nextInt();
// //     }
 
// //    for(int i=0;i<n;i++)
// //    {
// // System.out.println("your element " +(i+1)+ " is " + (a[i]));
// //     }
//     // i+1 n (i+1)*n
//     // name1 = Ramalinga PRasad
//     // age = 21

// // Ramalinga Prasad's age is 21;

// String name=sc.nextLine();
// int age=sc.nextInt();
// System.out.println(name + "'s age is " + age);


// // multiplicator , no of values
// 3 3
// 1 x 3 = 3
// 2 x 3 = 6 
// 3 x 3 = 9

// }
// }
import java.util.Scanner;
public class Sample{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int multiplicator=sc.nextInt();
    int no=sc.nextInt();
    for(int no1=1;no1<=no;no1++)
    {
        System.out.println(no1+"*"+multiplicator+"="+(no1*multiplicator));
    }

}}