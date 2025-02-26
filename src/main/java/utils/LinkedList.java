package utils;

public class LinkedList {
    private int numOfElements;
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.numOfElements = 0; //no argument constructor? yes
    }

    //TODO: size() Bema
    public int size(){
        return numOfElements;
    }
    //TODO: isEmpty() Bema

public boolean isEmpty(){
boolean found=false;
if(size()==0){
    found=true;
}
return true;
    //TODO: add() Oscar

    //TODO: addFirst() Maryam

    //TODO: add(value, pos)

    //TODO: indexOf() Oscar

    //TODO: get () Bema

    //TODO: set() Maryam

    //TODO: remove (pos) Bema

    //TODO: remove (value) Oscar

    //TODO: clear() Maryam
    private static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.next = null;
            this.data = data;
        }
    }
}
