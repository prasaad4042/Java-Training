import java.util.Scanner;
class Box  
{
    int width;
    int height;
    int breadth;
    float volume;
    float area;
    int sq;
    int m = 6;
     Box(){}
  Scanner sc = new Scanner(System.in);
   
 
    
    void input()
    {
          
    System.out.println("enter width, height and breadth: ");
        width = sc.nextInt();
        height = sc.nextInt();
        breadth = sc.nextInt(); 
    
    }

    float getVolume()
    {
        volume = width * breadth * height;
        System.out.println("volume of box is:"+volume);
        return volume;
    }

    float getArea()
    {
       sq = width * width;
        area = m * width;
        System.out.println("Area is:"+area);
        return area;
    }
}






public class DayeightAeight 
{

    public static void main(String[] args) 
    {
        Box b = new Box();      
        b.input();
        b.getVolume();
        b.getArea();        
    }

    
}