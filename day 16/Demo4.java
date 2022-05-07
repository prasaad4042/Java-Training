// object output stream

 import java.io.FileOutputStream;
 import java.io.ObjectOutputStream;
 import java.io.Serializable;
 class student implements Serializable{
     private int id;
     private String name;
     public int getId()
     {
         return id;

     }
     public void setId(int id)
     {
         this.id = id;


     }
     public String getName(){
         return name;

     }
     public void setName()
     {
         this.name = name;

     }

 }

 public class Demo4
 {
     public static void main(String[] args) {
         student st;
         st = new student();
         st.setId(1123);
         st.setName("prasaad");
         FileOutputStream fout;
         fout = new FileOutputStream("C:\\Users\\Prasaad\\Desktop\\capgtraining\\day 16\\test5");
         ObjectOutputStream out;
         out = new ObjectOutputStream(fout);
         out.writeObject(st);
         out.close();

         
     }

 }