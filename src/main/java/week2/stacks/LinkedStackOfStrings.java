package week2.stacks;

public class LinkedStackOfStrings implements StackOfStrings {

    private class Node{
        String item;
        Node next;
    }

    private Node first = null;

    @Override
    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
