import java.util.Scanner;
public class Student{
private String name;
private int rollno,year,maths,science,language;
private double average;
public void setName(String x){
    this.name = x;
}
public String getName(){
    return this.name;
}
public void setRollNo(int no){
    this.rollno = no;
}
public int getRollno(){
    return this.rollno;
}
public void setYear(int yr){
    this.year=yr;
}
public int getYear(){
    return this.year;
}
public void setMaths(int m){
    this.maths=m;
}
public int getMaths(){
    return this.maths;
}
public void setScience(int s){
    this.science=s;
}
public int getScience(){
    return this.science;
}
public void setLanguage(int l){
    this.language=l;
}
public int getLanguage(){
    return this.language;
}


public void setAverage(){
double total = (double)this.maths+this.science+this.language;
this.average = total/3;


}
public double getAverage(){
    return this.average;
}


public static void main(String args[]){
    System.out.println("enter the student Details:");
    Scanner sc=new Scanner(System.in);
    Student st = new Student();
    String name = sc.nextLine();
    int rollno=sc.nextInt();
    int year=sc.nextInt();
    int maths=sc.nextInt();
    int science=sc.nextInt();
    int language=sc.nextInt();


    st.setName(name);
    st.setRollNo(rollno);
    st.setYear(year);
    st.setMaths(maths);
    st.setScience(science);
    st.setLanguage(language);
    st.setAverage();
    // double average=(maths+science+language)/3.0;
    System.out.println("Student Name:"+st.getName());
    System.out.println("Roll.no:"+st.getRollno());
    System.out.println("Year:"+st.getYear());
    System.out.println("Maths mark:"+st.getMaths());
    System.out.println("Science mark:"+st.getScience());
    System.out.println("Language mark"+st.getLanguage());
     System.out.println("Average mark :"+st.getAverage());
} 
}   

