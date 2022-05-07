import java.util.Arrays;  
import java.util.Scanner; 
class DayfiveAeight  
{   
public static void main(String[] args)   
{ 
int i;
int a; 
int sum=0;

Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the number of element which you want to enter: ");
a = sc.nextInt();

int [] array = new int [a]; 
System.out.println("dear user, enter the elements now:");
for(i=0;i<array.length;i=i+1)
{
array[i] = sc.nextInt();
}

for(i = 0;i<array.length;i = i+1)
{

sum = sum+array[i];
}
System.out.println("sum of array element is:"+sum);

}
}
