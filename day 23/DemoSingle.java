//Design patterns -> creational patterns -> Singletone pattern


class Sequence{
    static int counter;
    static Sequence obj = null;
    private Sequence(){
        counter = 0;

    }
    static synchronized Sequence getInstance(){
        if(obj == null){
            obj = new Sequence();
            System.out.println("object created");

        }
        counter++;
        System.out.println("count is: "+counter);
        return obj;

    }

}




public class DemoSingle {
    public static void main(String[] args) {
        Sequence s1 = Sequence.getInstance();
        Sequence s2 = Sequence.getInstance();

    }
}
