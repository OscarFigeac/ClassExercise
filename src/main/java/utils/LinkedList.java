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

    /**
     * Takes in a String value and checks if it already exists in the List.
     * @param value the value being looked for.
     * @return false if the value is duplicate; true otherwise.
     * @author oscar
     */
    public boolean isNotDup(String value){
        if (value == null){
            return false;
        }
        Node current = first;
        for (int i = 0; i < numOfElements - 1; i++) {
            if (current.equals(current.next)){
                return false;
            }
        }
        return true;
    }

    //TODO: add(value, pos)
    public void add(String value, int pos){
        if (value == null){
            throw new IllegalArgumentException("Provided element cannot be null");
        }
        if (isEmpty() || pos < 0 || pos >= numOfElements){
            throw new IndexOutOfBoundsException("Provided position was " + pos + " which is outside " +
                    "of the boundary area");
        }
        Node newNode = new Node(value);
        Node current = first;
        for (int i = 0; i < pos-1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        numOfElements++;
    }

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
    public String remove(int pos){
        if(pos>=numOfElements || pos<0){
            throw new IndexOutOfBoundsException();
        }
        String data;
        if(pos==0){
            data=first.data;
            first=first.next;
        }
        else{
            Node current=first;
            Node previous=null;
            for(int i=0;i<pos;i++){
                previous=current;
                current=current.next;
            }
            data=current.data;
            previous.next=current.next;
        }
        numOfElements--;
        return data;
    }
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
    public void clear() {
        first = null;
        last = null;
        numOfElements = 0;
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

