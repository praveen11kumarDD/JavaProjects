class Method
{
 int id;
 String name;
 void insertDetail(int i,String n)
   {
     id=i;
     name=n;
   }
 void disInfo()
   {
     System.out.println(id+" "+name);
    }
}
class Details
{
 public static void main(String args[])
 {
   Method m1=new Method();
   Method m2=new Method();
   m1.insertDetail(700,"pravin");
   m2.insertDetail(100,"ram");
   m1.disInfo();
   m2.disInfo();
  }
}