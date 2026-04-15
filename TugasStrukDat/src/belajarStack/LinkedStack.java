package belajarStack;

public class LinkedStack <E> implements Stack<E> {
    private SinglyLinkedList<E> stack =new SinglyLinkedList<>();

    public LinkedStack() {
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public void push(E e) {
        stack.addFirst(e);
    }

    @Override
    public E top() {
        return stack.get(0);
    }

    @Override
    public E pop() {
        return stack.removeFirst();
    }
}


