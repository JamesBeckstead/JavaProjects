package com.company.ds;

import java.util.ArrayList;

public class ListQueue<X> implements Queue<X> {
    private ArrayList<X> data;
    private int front;
    private int end;

    public ListQueue(){
        data = new ArrayList();
        front = -1;
        end = -1;
    }

    @Override
    public boolean contains(X item) {
        if (size() == 0){
            throw new IllegalStateException("Nothing in the queue.");
        }
        return data.contains(item);
    }

    @Override
    public X access(int position) {
        if(size() == 0 || size() < position){
            throw new IllegalStateException("There is nothing at that location.");
        }
        int truePosition = 0;
        for (int i = front; i < end; i++) {
            if(truePosition ==  position){
                return data.get(i);
            }
            truePosition++;
        }
        throw new IllegalStateException("Item not found.");
    }

    @Override
    public void enQueue(X newItem) {
        if(front == -1 && end == -1){
            front++;
            end++;
            data.add(newItem);
        }
        else {
            data.add(newItem);
            end++;
        }
    }

    @Override
    public X deQueue() {
        X tgtItem;
        if(size() == 0){
            throw new IllegalStateException("There is nothing in the queue.");
        } else if (front == end){
            tgtItem = data.get(front);
            front = -1;
            end = -1;
        } else {
            tgtItem = data.get(front);
            front++;
        }
        return tgtItem;
    }

    @Override
    public int size() {
        if(front == -1 && end == -1){
            return 0;
        }
        return end - front + 1;
    }
}
