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

    private static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.next = null;
            this.data = data;
        }
    }
}
