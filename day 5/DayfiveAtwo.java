import java.util.Scanner;
class DayfiveAtwo
{
public static void main(String[] args)
{
int[] val ={13,-4,82,17};
int[] twice = new int[4];
int i;

for(i=0;i<val.length;i=i+1)
{
twice[i] = 2*val[i];

}
System.out.print("original array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(val[i]);
}
System.out.print("twice array is:");
for(i=0;i<val.length;i=i+1)
{
System.out.println(twice[i]);
}


}
}