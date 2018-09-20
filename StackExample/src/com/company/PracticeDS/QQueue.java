package com.company.PracticeDS;

public interface QQueue<X> {

    public void enQueue(X newItem);

    public X deQueue();

    public boolean contains(X item);

    public X access(int position);

    public int size();
}
