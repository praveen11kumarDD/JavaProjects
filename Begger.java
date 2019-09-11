import java.util.*;
public class Begger { 
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in); 
         int nowHand=sc.nextInt();
          int beggarCount=sc.nextInt();
           int i = 1;
            while(i<=beggarCount)
            { nowHand = nowHand *2;
             i++;
              } 
              System.out.println(nowHand);
    }
}