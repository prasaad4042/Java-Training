class bank{
  static int count ;
static  bank b = null;
private bank(){
  count = 0;
}


  static synchronized bank game(){
    if(b == null){
      b = new bank();
      System.out.println("object created");

    }

    count++;
    System.out.println("count is: "+count);
    return b;
  }
}

public class A1{
  public static void main(String[] args) {
    bank a1 =  bank.game();
    bank a2 = bank.game();



  }
}
