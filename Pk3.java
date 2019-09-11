class refPk3
{
  int id;
  String name;
}
class TestStudent
{
  public static void main(String args[])
  {
    Pk3 s1=new Pk3();
    Pk3 s2=new Pk3();
    s1.id=007;
    s2.name="pravin";
    System.out.println(s1.id+s2.name);
   }
}