// Un nodo de lista enlazada
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class pru_001 {
    // Función auxiliar para imprimir una lista enlazada dada
    public static void printList(Node head) {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    // Función ingenua para la implementación de listas enlazadas que contienen tres
    // nodos
    public static Node constructList() {
        // construir nodos de lista enlazada
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // reordenar las referencias para construir una lista
        Node head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;

        // devuelve la referencia al primer nodo de la lista
        return head;
    }

    public static void main(String[] args) {
        // `head` apunta al nodo principal de la lista enlazada
        Node head = constructList();

        // imprimir lista enlazada
        printList(head);
    }
}