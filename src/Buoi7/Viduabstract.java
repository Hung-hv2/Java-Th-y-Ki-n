package Buoi7;
abstract class A {
    abstract int hello(String name);
    abstract public void say();
}
public class Viduabstract {


    public static void main(String[] args) {
        A a = new A() {
            @Override
            int hello(String name) {
                return 0;
            }

            @Override
            public void say() {

            }
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
    }
}
