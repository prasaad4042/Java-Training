class Customer
{  String fname;
    String lname;

  Customer(String a, String b)
  {
    this.fname = a;
    this.lname = b;
  }
  String d(){
   return fname;  }
   String e(){
   return lname;  }
}

class Accounts
{
    Customer c;
    int balance;

    Accounts(Customer a, int b)
    {   
        this.c =a;
        this.balance = b;
        
    }

    void show()
    {
        System.out.println("firstname:"+c.d());
        System.out.println("lastname:"+c.e());
      
        System.out.println("balance:"+balance);


    }

}





public class DaysixAthree 
{
    public static void main(String[] args)
    {  Customer c1 = new Customer("prasaad","gade");
       Customer c2 = new Customer("onkar","gade");

        Accounts A1 = new Accounts(c1,2000);
        Accounts A2 = new Accounts(c2,3000);
        A1.show();
        A2.show();
    }
    
}