import java.util.Scanner;
public class Vowstr{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String vowels = "";
        String consonants = "";
        for(int i=0;i<st.length();i++)
        {
         char ch=st.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {   
            vowels += String.valueOf(ch);
                    }
        else{
            consonants += String.valueOf(ch);
        }  
   
}
System.out.println(vowels);
System.out.println(consonants);
    }
}