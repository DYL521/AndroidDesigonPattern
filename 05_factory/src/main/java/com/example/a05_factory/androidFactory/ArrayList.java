package com.example.a05_factory.androidFactory;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ArrayList<E>  extends AbstractList<E> implements Cloneable, Serializable, RandomAccess {


    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean removeIf(Predicate<? super E> predicate) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> unaryOperator) {

    }

    @Override
    public void sort(Comparator<? super E> comparator) {

    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> consumer) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }
}
