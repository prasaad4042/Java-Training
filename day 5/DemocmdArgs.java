class DemocmdArgs
{
public static void main(String[] args)
{
float a,b,c;



if(args.length == 2)
{
a = Float.parseFloat(args[0]);
b = Float.parseFloat(args[1]);
c = a+b;

System.out.println(c);
}
else
{
System.out.println("enter only 2 arguments");
}






}}