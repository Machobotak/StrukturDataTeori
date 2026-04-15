package belajarStack;

public class SinglyLinkedList<E> {
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data){
            this.data = data;
            this.next = null;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;


    public void addFirst(E data){
        Node<E> newNode = new Node<>(data);
        if(head == null){
            head = tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E data){
        Node<E> newNode = new Node<>(data);
        if(tail == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E removeFirst(){
        if(head == null){
            return null;
        }
        E removed = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return removed;
    }

    public E removeLast(){
        if(head == null){
            return null;
        }
        if(head == tail){
            E removed = head.data;
            head = tail = null;
            size--;
            return removed;
        }
        Node<E> current = head;
        while(current.next != tail){
            current = current.next;
        }
        E removed = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return removed;
    }

    public E get(int index){
        if (index < 0 || index >= size){
            return null;
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public void print(){
        Node<E> current = head;
        while (current != null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    int size (){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

}
