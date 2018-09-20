package com.company.ds;

public class BasicLinkedList<X> {
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList() {
        first = null;
        last = null;
        nodeCount = 0;
    }

    public void add(X item) {
        //this condition means we are adding something for the first time.
        if(first == null) {
            first = new Node(item);
            last = first;
        }
        //otherwise, we want to grab the last node and update it's value
        else {
            Node newLastNode = new Node(item);
            last.setNextNode(newLastNode);
            last = newLastNode;
        }
        nodeCount++;
    }

    public void insert(X item, int position){
        if(size() < position) {
            throw new IllegalStateException("The linked list isn't that big.");
        }

        Node currentNode = first;

        //sdfasdfadfadf
        for(int i = 1; i < position && currentNode != null; i++) {
            currentNode = currentNode.getNextNode();
        }

        //asdfasdfasd
        Node newNode = new Node(item);
        Node nextNode = currentNode.getNextNode();
        currentNode.setNextNode(newNode);
        newNode.setNextNode(nextNode);
        nodeCount++;
    }



    public X removeAt(int position){
        if(first == null) {
            throw new IllegalStateException("The linked list isn't that big.");
        }

        Node currentNode = first;
        Node prevNode = first;

            //fasdfasdfasdf
        for(int i = 1; i < position && currentNode != null; i++) {
            prevNode = currentNode;
            currentNode = currentNode.getNextNode();
            System.out.println("memememme size = " + size());
            System.out.println("Next node = " + toString());

        }

        //asdfasdfasd
        X nodeItem = currentNode.getNodeItem();
        prevNode.setNextNode(currentNode.getNextNode());
        System.out.println("memememme size = " + size());
        System.out.println("Next node = " + toString());
        nodeCount--;
        return nodeItem;

    }

    public X remove(){
        if(first == null){
            throw new IllegalStateException("Nothing on the linked list.");
        }

        X tgtItem = first.getNodeItem();

        //asdfasd
        first = first.getNextNode();
        nodeCount--;
        return tgtItem;
    }



    public X get(int position){
        if(first == null){
            throw new IllegalStateException("The linked list is smaller than your request.");
        }

        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null; i++) {
            if(i == position) {
                return currentNode.getNodeItem();
            }
            currentNode = currentNode.getNextNode();
        }

        //sdafsdfasdfasd
        return null;
    }

    public int find(X item){
        if(first == null){
            throw new IllegalStateException("There is nothing in the linked list.");
        }

        Node currentNode = first;
        for(int i = 1; i < size() && currentNode != null; i++) {
                if(currentNode.getNodeItem().equals(item)){
                    return i;
                }

                currentNode = currentNode.getNextNode();
        }


        return -1;
    }

    public String toString(){
        StringBuffer content = new StringBuffer();
        Node currentNode = first;

        while(currentNode != null){
            content.append(currentNode.getNodeItem());
            currentNode = currentNode.getNextNode();

            if(currentNode != null){
                content.append(", ");
            }
        }
        return content.toString();
    }

    public int size(){
        return nodeCount;
    }

    public class Node{
        private Node nextNode;
        private X nodeItem;

        public Node(X item){
            this.nextNode = null;
            this.nodeItem = item;
        }

        public void setNextNode(Node nextNode){
            this.nextNode = nextNode;
        }

        public Node getNextNode(){
            return nextNode;
        }

        public X getNodeItem(){
            return nodeItem;
        }
    }
}
