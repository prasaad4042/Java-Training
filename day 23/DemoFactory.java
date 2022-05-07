//Design patterns -> creational patterns -> factory pattern



abstract class Account{
    void getCustInfo(){
        System.out.println("get customer information");
    }

    abstract void CalculateInterest();

}

class Saving extends Account{
    @Override
    void CalculateInterest(){
        System.out.println("calculate interest of saving");
    }
}

class Loan extends Account{
    @Override
    void CalculateInterest(){
        System.out.println("calculate interest of Loan");
    }
}

class AccountFactory{
    public static Account getAccount(String type){
        Account obj = null;
        if(type.equalsIgnoreCase("saving")){
            obj = new Saving();
        }
        else{
            obj = new Loan();

        }
        return obj;
    }
}

public class Demofactory{
    public static void main(String[] args) {
        Account ob1 = AccountFactory.getAccount("loan");
        ob1.CalculateInterest();

        Account ob2 = AccountFactory.getAccount("saving");
        ob2.CalculateInterest();
    }
}
