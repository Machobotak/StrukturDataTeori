public class Main {
    static void main() {
        SinglyLinkedList<String> kota = new SinglyLinkedList<>();
        kota.addFirst("Sangatta");
        kota.addLast("Bontang");
        kota.addLast("Samarinda");
        kota.addLast("Balikpapan");

        System.out.println("Isi Singly LinkedList");
        kota.print();

        kota.removeFirst();
        kota.print();
        kota.removeLast();
        kota.print();
        System.out.println(kota.get(1));
        System.out.println();

        DoublyLinkedList<String> kota1 = new DoublyLinkedList<>();
        kota1.addFirst("Balikpapan");
        kota1.addLast("Samarinda");
        kota1.addLast("Bontang");
        kota1.addLast("Sangatta");

        System.out.println("Isi Doubly LinkedList");
        kota1.print();

        kota1.removeFirst();
        kota1.print();
        kota1.removeLast();
        kota1.print();
        System.out.println(kota1.get(0));
    }
}
