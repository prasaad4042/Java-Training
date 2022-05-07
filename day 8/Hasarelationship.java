class address
{
    int hn;
    String areaname;
    String city;

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setHn(int hn) {
        this.hn = hn;
    }

    public String getAreaname() {
        return areaname;
    }
    public String getCity() {
        return city;
    }
    public int getHn() {
        return hn;
    }
    

}

class student
{   int id;
    String name;
    address adr;

    public void setAdr(address adr) {
        this.adr = adr;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public address getAdr() {
        return adr;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }


}





class Hasarelationship
{
    public static void main(String[] args)
     {

        address ad1= new address();
        student st1 = new student();
        
        
        ad1.setAreaname("ulkanagri");
        ad1.setCity("aurangabad");
        ad1.setHn(12);
    
        
        st1.setAdr(ad1);
        st1.setId(14);
        st1.setName("prasaad");



        address ad2 = st1.getAdr();
        int n = ad1.getHn();
        String s = ad1.getCity();
        int i = st1.getId();
        String s2 = st1.getName();
        String a = ad1.getAreaname();
        
    }

}