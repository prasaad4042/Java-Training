class Volumeofroom
{
   int width;
   int height;
   int length;
   int m;
   int n;
   Volumeofroom(int a, int b, int c)
   {
     this.width = a;
     this.height = b;
     this.length = c;
     this.m = a*b;
     this.n = m*c;
   }
    void volume()
   {
       
      System.out.println("volume of room is:"+n);
   }

}



class DaysixAsix
{
     public static void main(String[] args)
     {
      Volumeofroom v1 = new Volumeofroom(10,20,30);
      v1.volume();
     
     } 
   

}