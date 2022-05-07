class Ticketlist
{

    String dcity;
    String acity;
    int flightno;
    String assignment;

    Ticketlist(String a, String b, int c, String d)
    {
        this.dcity = a;
        this.acity = b;
        this.flightno = c;
        this.assignment = d;
        
    
        System.out.println("departure city:"+dcity);
        System.out.println("arrival city:"+acity);
        System.out.println("flight no:"+flightno);
        System.out.println("sitting arrangement:"+assignment);}


    

    
    
}




class DaysixAfour
{
    public static void main(String args[])
    {
        Ticketlist t1 = new Ticketlist("pune","mumbai",5641,"27P");
        Ticketlist t2 = new Ticketlist("mumbai","pune",8974,"14N");
        

    }



    
}