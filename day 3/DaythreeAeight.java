import java.util.*;
class DaythreeAeight
{
public static void main(String args[])
{

int a;




System.out.println("Dear user, enter your percentage: ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();



if(a>=90)
{
System.out.println("Grade A");
}

else if(a> 80 && a<=90)
{
System.out.println("Grade B");
}
else if(a> 70 && a<=80)
{
System.out.println("Grade C");
}

else if(a> 60 && a<=70)
{
System.out.println("Grade D");
}
else if(a> 60 && a<=40)
{
System.out.println("Grade E");
}
else
{
System.out.println("Grade F");
}


}
}

