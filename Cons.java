public class Cons
{
  Cons()
   {
     int id=707;
     String name="pk";
    }
 void dis()
   {
     System.out.println(id+" "+name);
    }
}
class Def
{
 public static void main(String args[])
  {
    Cons d1=new Cons();
     d1.dis();
  }
}