package com.company.PracticeDS;

public interface SStack<X> {

    public void push(X newItem);

    public X pop();

    public boolean contains(X item);

    public X access(X item);

    public int size();
}
