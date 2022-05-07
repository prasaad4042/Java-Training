import java.util.Scanner;
class ForEachloop
{
public static void main(String[] args)
{

int arr[] = {2,5,6,8,9,4,1};
int a;
boolean isfound = false;
for(int x:arr)
{
System.out.println(x);
}

System.out.println("dear user, enter item to search: ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
for(int x: arr)
{
if(a == x)
{
isfound = true;
break;
}

}
if(isfound == true)
{
System.out.println("item found");}
else
{
System.out.println("item not found");
}

}}