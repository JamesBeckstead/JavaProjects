package com.company.PracticeDS;


public class BStack<X>{
    private X[] data;
    private int stackPointer;

    private BStack(){
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X newItem) {
        data[stackPointer++] = newItem;
    }

    public X pop(){
        if(size() == 0){
            throw new IllegalStateException("There is nothing in the stack.");
        }
        return data[--stackPointer];
    }

    public X access(X item){
        while(stackPointer > 0){
            X tempItem = pop();
            if(tempItem.equals(item)){
                return tempItem;
            }
        }
        throw new IllegalStateException("Item is not in stack.");
    }

    public boolean contains(X item){
        boolean found = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    public int size(){
        return stackPointer;
    }
}