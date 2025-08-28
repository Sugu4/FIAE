package oop;

public interface Hop {
    public default void jump(int height) {
        System.out.println(height);
    }
}
