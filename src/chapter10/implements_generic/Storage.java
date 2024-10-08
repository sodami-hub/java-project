package chapter10.implements_generic;

public interface Storage<T> {

    void add(T item, int index);
    T get(int index);
}
