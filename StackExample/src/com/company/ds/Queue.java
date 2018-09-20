package com.company.ds;

public interface Queue<X> {

    public boolean contains(X item);

    public X access (int position);

    public void enQueue(X newItem);

    public X deQueue();

    public int size();


}
