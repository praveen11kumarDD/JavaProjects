import java.util.Scanner;
public class CalcMethod
{
    public static int add(int n1,int n2){
        return n1+n2;
    }
    public static int sub(int n1,int n2){
        return n1-n2;
    }
    public static int mul(int n1,int n2){
        return n1*n2;
    }
    
    public static int div(int n1,int n2){
        return n1/n2;
    }

    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the two numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();


        //Bitwise 
        int i = 4;
        int j = 8;
        i= i|i&j|i;
        j = i|j&j|i;
        System.out.println(i+" "+j);
        System.out.println(i);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.exit");
        System.out.println("Enter your choice");
        int choice = in.nextInt();
        switch(choice){
            // CalcMethod a = new CalcMethod();
       case 1: System.out.println(add(n1,n2));break;
        case 2:System.out.println(sub(n1,n2));break;
        case 3:System.out.println(mul(n1,n2));break;
        case 4:System.out.println(div(n1,n2));break;

        }
    }
 }