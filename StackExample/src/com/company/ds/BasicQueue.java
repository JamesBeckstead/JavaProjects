package com.company.ds;

public class BasicQueue<X> implements Queue<X> {
    private X[] data;
    private int front;
    private int end;

    public BasicQueue(){
        this(1000);
    }

    public BasicQueue(int size){
        this.front = -1;
        this.end = -1;
        data = (X[])new Object[size];
    }

    public int size(){
        if (front == -1 && end == -1){
            return 0;
        }else{
            return end - front + 1;
        }
    }

    public void enQueue(X newItem) {
        if ((end + 1) % data.length == front) {
            throw new IllegalStateException("The queue if full.");
        } else if (size() == 0) {
            front++;
            end++;
            data[end] = newItem;
        } else
            end++;
            data[end] = newItem;
    }

    public X deQueue() {
        X item;
        if(size() == 0) {
            throw new IllegalStateException("Nothing in the queue.");
        }

        else if ( front == end ){
            item = data[front];
            front = -1;
            end = -1;
        }else {
            item = data[front];
            front++;
        }
        return item;
    }

    public boolean contains(X item){
        boolean found = false;
        if (size() == 0){
            return found;
        }
        for (int i = front; i < end; i++) {
            if (data[i].equals(item)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(int position){
        if (size() == 0 || position > size()){
            throw new IllegalStateException("No items are in the queue or ask is outside queue range.");
        }
        int trueIndex = 0;
        for (int i = front; i < end ; i++) {
            if (trueIndex == position){
                return data[i];
            }
            trueIndex++;
        }
        throw new IllegalStateException("Item not found.");
    }
}
