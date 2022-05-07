import java.util.*;
class DaythreeAfive
{
public static void main(String args[])
{
String s1;
char ch;
int a;


System.out.println("Dear user, a character: ");
Scanner sc = new Scanner(System.in);
s1 = sc.next();
ch = s1.charAt(0);
a = ch;



if(a == 65 || a == 69 || a == 73|| a == 79 || a == 85)
{
System.out.println("entered character is vowel");
}

else{
System.out.println("entered character is consonant");
}
}
}

