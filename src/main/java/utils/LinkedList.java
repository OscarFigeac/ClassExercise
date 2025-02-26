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

    //TODO: isEmpty() Bema

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
    public void addFirst(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Null cannot be added to the List");
        }
        Node newNode = new Node(value);
        if (first == null) {
            //Set the first element in the list to be the new node

            first = newNode;
            last = newNode;
        }
    }
}

