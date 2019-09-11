class Bank
{
  int Ac;
  String name;
  float amount;
  void insert(int a,String n,float amt)
   {
     Ac=a;
     name=n;
     amount=amt;
    }
  void deposit(float amt)
{
  amount=amount+amt;
  System.out.println(amt+"deposit");
 }
void withdraw(float amt)
{
   if(amount<amt)
{
  System.out.println("insufficient Balance");
}
   else
   {
     amount=amount-amt;
    System.out.println(amt+"withdraw");
    }
}
void checkBalance()
{
  System.out.println("balance is"+amount);
}
void display()
{
System.out.println(Ac+" "+name+" "+amount);
}
}
class Bankdetail
{
 public static void main(String args[])
{
  Bank b1=new Bank();
  b1.insert(9213,"pk",5000);
  b1.display();
  b1.deposit(10000);
  b1.checkBalance();
  b1.withdraw(10000);
  b1.checkBalance();
}
}