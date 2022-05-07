import java.util.Arrays;  
import java.util.Scanner; 
class DayfiveAsix  
{   
public static void main(String[] args)   
{  int i;
int a; 
Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the number of element which you want to enter: ");
a = sc.nextInt();

int [] array = new int [a]; 
System.out.println("dear user, enter the elements now:");
for(i=0;i<array.length;i=i+1)
{
array[i] = sc.nextInt();
}

Arrays.sort(array);   
 
System.out.println("Elements of array sorted in ascending order: ");  
//prints array using the for loop  
for (i = 0; i < array.length; i++)   
{       
System.out.println(array[i]);   
}   
}  
}  