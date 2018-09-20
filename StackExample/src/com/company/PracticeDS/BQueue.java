package com.company.PracticeDS;

public class BQueue<X> implements QQueue<X>{
    private int front;
    private int end;
    private X[] data; // missed the fact that I need to establish a data structure each time class is called

    public BQueue(){
        this(1000);   //this refers to the object so I can supply 1000 as the size
    }

    public BQueue(int size) {
        this.front = -1; //failed to realize the need for this key word, this refers to object
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public void enQueue (X newItem){
        //failed to anticipate the need to check if the queue is full, remember lines can be full
        if((end + 1) % data.length == front){
            throw new IllegalStateException("The queue is full.");
        }else if(size() == 0){
            front = 0;
            end = 0;
            data[front] = newItem;
        } else {
            end++;
            data[end] = newItem;
        }
    }

    public X deQueue(){
        X item; // failed to understand the need for temp item to hold the first value
        if (front == -1 ){
            throw new IllegalStateException("The queue is empty.");
        }else if (front == end){ //failed to grasp the need to see if the queue had only one item
            item = data[end];
            front = -1;
            end = -1;
        } else {
            item = data[front];
            front++;
        }
        return item;
    }

    public boolean contains(X item){
        boolean found = false;
        if(front == -1) {
            throw new IllegalStateException("The queue doesn't contain anything.");
        }
        for (int i = front; i < size(); i++) {
            if(data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(int position){
       /* X tempItem; messed up the queue with the stack, need to cycle through the items from front to back
       while(front < end){
           if (data[front].equals(item)){
               return data[front];
           }
           front++;
       }*/
        if (size() == 0 || position > size()) {
            throw new IllegalStateException("The queue is not that big.");
        }
       int truePosition = 0;
        for (int i = front; i < end ; i++) {
            if(truePosition == position){
                return data[i];
            }
            truePosition++;
        }
       throw new IllegalStateException("Item not found.");
    }


    public int size(){
        if(front == -1 && end == -1){ //it is easier to wrap this in an if statement so the 0 is returned
            return 0;
        } else {
            return end - front + 1;
        }
    }
}
