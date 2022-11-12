package Buoi7;

public interface Demo {
    //các chức năng bên trong interface
    default void hello() {
        System.out.println("hello");
    }
}
