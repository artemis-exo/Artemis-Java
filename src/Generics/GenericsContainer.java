package Generics;

public class GenericsContainer<T> implements Container<T>{

    private T ite;
    @Override
    public void add(T item) {
        this.ite=item;

    }

    @Override
    public T get() {
        return ite;
    }
}
