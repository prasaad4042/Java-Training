//Stream  and new type of forEach loop and generating memory according to our need means assigning memory to array element according to our need


import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {
        Stream<Integer> s1=Stream.of(10,20,30,40);
        s1.forEach(p->System.out.println(p));
        Integer arr[]={1,2,3,4};
        Stream<Integer> s2=Stream.of(arr);

        s2.forEach(x->System.out.println(x*x));
    }
}
