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
    public void add(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        Node newNode = new Node(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        numOfElements++;
    }

    //TODO: addFirst() Maryam


    //TODO: add(value, pos)

    //TODO: indexOf() Oscar
    public int indexOf(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        Node newNode = new Node(value);
        Node current = first;
        for (int i = 0; i <= numOfElements; i++) {
            if (current.equals(newNode)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    //TODO: get () Bema

    //TODO: set() Maryam

    //TODO: remove (pos) Bema

    //TODO: remove (value) Oscar
    public void remove(String value){
        int pos = indexOf(value);
        if (isEmpty() || pos < 0 || pos >= numOfElements){
            throw new IndexOutOfBoundsException("Provided position was " + pos + " which is outside " +
                    "of the boundary area");
        }
        if (pos == 0){
            Node current = first;
            first = first.next;
            if (first == null){
                last = null;
            }
        }else{
            Node current = first;
            Node prev = null;
            for (int i = 0; i < pos; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            if (prev.next == null){
                last = prev;
            }
        }
        numOfElements--;
    }
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

