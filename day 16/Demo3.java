// data input stream

 import java.io.*;
 public class Demo3{
     public static void main(String[] args) throws Exception {
         FileInputStream fin;
         fin = new FileInputStream("C:\\Users\\Prasaad\\Desktop\\capgtraining\\day 16\\test4.txt");
         DataInputStream din;
         din = new DataInputStream(fin);
         int x = din.readInt();
         boolean y = din.readBoolean();
         double z = din.readDouble();
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
         
     }
 }