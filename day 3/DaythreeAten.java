// steam engine efficiency


import java.util.Scanner;
class DaythreeAten
{
public static void main(String args[])
{
float steamtemp;
float airtemp;
float div;
float efficiency;

Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter air temperature and temprature of steam: ");

airtemp = sc.nextFloat();
steamtemp = sc.nextFloat();
if (steamtemp< 373)
{
  System.out.println("efficiency is 0"); 
}
else
{
   div = airtemp / steamtemp;
   efficiency = 1- div;
   System.out.println("efficiency is "+efficiency);
}

}
}