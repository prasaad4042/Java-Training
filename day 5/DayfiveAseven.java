import java.util.Arrays;  
import java.util.Scanner; 
class DayfiveAseven  
{   
public static void main(String[] args)   
{ 
int i;
int a;
int b; 
int c;
Scanner sc = new Scanner(System.in);
System.out.println("Dear user, enter the number of element which you want to enter: ");
a = sc.nextInt();

int [] array = new int [a];
int [] valb = new int[a]; 
System.out.println("dear user, enter the elements now:");
for(i=0;i<array.length;i=i+1)
{
array[i] = sc.nextInt();
}

b = array.length-1;
for(i=0;i<array.length;i=i+1)
{
c = b-i;
valb[i] = array[c];

}
System.out.print("reverse array is:");
for(i=0;i<array.length;i=i+1)
{
System.out.println(valb[i]);
}


}
}
