import java.util.Scanner;
class DayfiveAone
{
public static void main(String[] args)
{
int i,sum=0;
Scanner sc = new Scanner(System.in);
int[] arr = new int[5];
for(i =0;i<arr.length;i=i+1)
{
arr[i]= sc.nextInt();

}

for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);

}

for(i=0;i<arr.length;i=i+1)
{
sum = sum + arr[i];

}

System.out.println("sum of all elements is: "+sum);
}

}