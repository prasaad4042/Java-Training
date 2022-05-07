import java.util.Scanner;

public class A1
{
    public static void main(String[] args) {

        int d1 = 0;


        System.out.println("dear user enter the starting year");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("dear user enter the current year");
        int b = sc.nextInt();

        for(int i = a;i<=b;i++){
            if(i%4 == 0 && i%100==0 ){
              if(i%400 == 0){
                d1 = d1+366;
              }
              else{
                d1 = d1 + 365;
              }

            }
            else{
                d1 = d1 +365;
            }
        }

        System.out.println(d1);



    }
}
