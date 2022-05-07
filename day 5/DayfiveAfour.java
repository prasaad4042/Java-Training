import java.util.Scanner;
class DayfiveAfour
{
public static void main(String[] args)
{
int[] val ={13,-4,82,17};
int[] valb = new int[4];
int i;

for(i=0;i<val.length;i=i+1)
{
valb[i] = 25 -val[i];

}
System.out.print("original array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(val[i]);
}
System.out.print("t arro get sum 25 another array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(valb[i]);
}


}
}