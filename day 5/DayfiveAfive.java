import java.util.Scanner;
class DayfiveAfive
{
public static void main(String[] args)
{
int[] val ={13,-4,82,17};
int[] valb = new int[4];
int i;
int b;
int c;
b = val.length-1;
for(i=0;i<val.length;i=i+1)
{
c = b-i;
valb[i] = val[c];

}
System.out.print("original array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(val[i]);
}


System.out.print("reverse array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(valb[i]);
}


}
}