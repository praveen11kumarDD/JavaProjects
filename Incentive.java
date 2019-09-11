import java.util.*;
public class Incentive {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
           int todayAmount=sc.nextInt(); 
           int dayCount=sc.nextInt(); 
           int result =0; 
           int dailyAmount =0; 
           for(int day=0;day<dayCount;day++) 
           {
            // dailyAmount = dailyAmount+ todayAmount;
            dailyAmount += todayAmount; 
            todayAmount = todayAmount+200;
           } 
             System.out.println(dailyAmount);
         }
     }