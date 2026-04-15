package TugasQueue;

public class Main {
    public static void main(String[] args) {
        Queue cc1 = new Queue();
        Queue cc2  = new Queue();
        Queue cc3  = new Queue();

        System.out.println("=== CC1 ===");
        cc1.enqueue(11001);
        cc1.enqueue(11011);
        cc1.Display();
        System.out.println();

        cc1.dequeue();
        cc1.Display();
        System.out.println();

        cc1.enqueue(11123);
        cc1.enqueue(11015);
        cc1.Display();
        System.out.println();

        cc1.dequeue();
        cc1.Display();
        System.out.println();

        cc1.enqueue(11331);
        cc1.Display();
        System.out.println();

        System.out.println("=== CC2 ===");
        cc2.enqueue(11011);
        cc2.Display();
        System.out.println();

        cc2.dequeue();
        cc2.Display();
        System.out.println();

        cc2.enqueue(11321);
        cc2.enqueue(11250);
        cc2.enqueue(11890);
        cc2.enqueue(11765);
        cc2.Display();
        System.out.println();

        cc2.dequeue();
        cc2.Display();
        System.out.println();

        System.out.println("=== CC3 ===");
        cc3.enqueue(11543);
        cc3.enqueue(11632);
        cc3.Display();
        System.out.println();

        cc3.dequeue();
        cc3.dequeue();
        cc3.Display();
        System.out.println();

        cc3.enqueue(11387);
        cc3.enqueue(11289);
        cc3.Display();
        System.out.println();

        cc3.dequeue();
        cc3.Display();
        System.out.println();
    }
}
