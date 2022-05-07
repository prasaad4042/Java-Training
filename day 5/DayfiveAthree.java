import java.util.Scanner;
class DayfiveAthree
{
public static void main(String[] args)
{
int i;
int[] vala ={13,-4,82,17};
int[] valb ={1,-4,8,-7};
int[] valc = new int[vala.length];
for(i=0;i<vala.length;i=i+1)
{
valc[i]= vala[i] +valb[i];
}

System.out.println("addition of arrays at respective postion is: ");
for(i=0;i<valc.length;i=i+1)
{
System.out.println(valc[i]);
}
}

}