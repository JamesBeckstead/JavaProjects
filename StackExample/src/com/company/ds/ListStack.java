package com.company.ds;

import java.util.ArrayList;

public class ListStack<X> implements Stack<X> {
    private ArrayList data;
    private int stackPointer;

    public ListStack(){
        data = new ArrayList<X>();
        stackPointer = 0;
    }

    @Override
    public void push(X newItem) {
        data.add(newItem);
        stackPointer++;
    }

    @Override
    public X pop() {
        if (stackPointer == 0){
            throw new IllegalStateException("Nothing in the stack.");
        }
        X tmpItem = (X) data.get(data.size() - 1);
        data.remove(data.size() - 1);
        stackPointer--;
        return tmpItem;
    }

    @Override
    public boolean contains(X item) {
        boolean found = false;
        for(int i = 0; i < stackPointer; i++){
            if (data.get(i).equals(item)){
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public X access(X item) {
        while(stackPointer > 0){
            X tmpItem = pop();
            if (tmpItem.equals(item)){
                return tmpItem;
            }
        }
        throw new IllegalStateException("Not on the stack.");
    }

    @Override
    public int size() {
        return stackPointer;
    }

}
