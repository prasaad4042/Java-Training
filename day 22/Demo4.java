//functional interface


@FunctionalInterface
 interface A<T> {
    T add(T x,T y);
}
public class Demo4 {
    public static void main(String[] args) {

        A<Integer> ob=(x, y) -> x+y;

        System.out.println(ob.add(200, 300));
}}
