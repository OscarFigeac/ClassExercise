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
    return found;
}
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
    public String get(int pos){
        if(isEmpty() || pos>=size() || pos<0){
            throw new IndexOutOfBoundsException();
        }
    else{
        Node current=first;
        for(int i=0;i<pos;i++){
            current=current.next;
        }
        return current.data;
    }
}
    //TODO: set() Maryam
    public void set(int index, String data) {
        // VALIDATION:
        if (isEmpty() || index < 0 || index >= numOfElements) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + numOfElements + ". (Supplied index was " + index + ")");
        }

        // SET UP:
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // UPDATE:
        current.data = data;
    }

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
    public void clear(){

    }

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

