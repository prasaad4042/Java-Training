//microwave oven heating time



import java.util.Scanner;
class DaythreeAthirteen
{
public static void main(String aregs[])
{
int item;
int a;
float totaltime;
float min;
float sec;
float tmin;
float tsec;
float k;
float kmin;
float ksec;

Scanner sc = new Scanner(System.in);
System.out.println("enter the number of items: ");
item = sc.nextInt();

System.out.println("enter time requried for heating of one item: ");
a = sc.nextInt();
if(item==3)
{

   if(a<=99)
   {
   totaltime = 2*a;
      System.out.println("heat for "+totaltime+" seconds");
    
   }
   else if(a>=100 && a<=999)
   {
     sec = a%100;
     min = a/100;
     tmin = 2*min;
     tsec = 2*sec;
     System.out.println("heating time is "+tmin+" minutes and "+ tsec +" seconds " );
   }
   else if(a>1000 && a<9999)
   {
     sec = a%100;
     min = a/100;
     tmin = 2*min;
     tsec = 2*sec;
     System.out.println("heating time is "+tmin+" minutes and "+ tsec +" seconds " );
   
   }
}

else if(item == 1)
{
    if(a<=99)
   {
      System.out.println("heat for "+a +" seconds");
    
   }
   else if(a>=100 && a<=999)
   {
     sec = a%100;
     min = a/100;
 
     System.out.println("heating time is "+ min +" minutes and "+ sec +" seconds " );
   }
   else if(a>1000 && a<9999)
   {
     sec = a%100;
     min = a/100;
 
     System.out.println("heating time is "+ min +" minutes and "+ sec +" seconds " );
   
   }


}

else if(item == 2)
{
    if(a<=99)
   {  k = a/2;
      tsec = a +k;
      System.out.println("heat for "+tsec +" seconds");
    
   }
   else if(a>=100 && a<=999)
   {
     sec = a%100;
     min = a/100;
      kmin = min/2;
      ksec = sec/2;
      tmin = kmin + min;
      tsec = ksec + sec;
     System.out.println("heating time is "+ tmin +" minutes and "+ tsec +" seconds " );
   }
   else if(a>1000 && a<9999)
   {
     sec = a%100;
     min = a/100;
      kmin = min/2;
      ksec = sec/2;
      tmin = kmin + min;
      tsec = ksec + sec;
     System.out.println("heating time is "+ tmin +" minutes and "+ tsec +" seconds " );
   
   }


}




}
}

