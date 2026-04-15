package TugasQueue;

public class Queue {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    private Node front;
    private Node rear;

    public Boolean isEmpty(){
        return front == null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Masuk: "+data);
    }

    public void  dequeue(){
        if(isEmpty()){
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Layani: "+front.data);
        front = front.next;
        if(front == null){
            rear = null;
        }
    }

    public void Display(){
        Node temp = front;
        System.out.print("Isi Antiran ");
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
