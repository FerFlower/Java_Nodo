class Node {
    public int valor;
    public Node next;

    public Node(int valor) {
        this.valor = valor;
        this.next = null;
    }
}

class Lista {

    private Node root;

    public void addFinal(Node tmp) {
        if (root == null) {
            root = tmp;
        } else {
            Node current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = tmp;
        }
    }

    public void addInicio(Node tmp) {
        tmp.next = root;
        root = tmp;
    }

    public void Print() {
        Print(root);
        System.out.println("null");
    }

    private void Print(Node tmp) {
        if (tmp == null) {
            return;
        }
        System.out.print(tmp.valor + " -> ");
        Print(tmp.next);
    }
}

public class practica {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.addInicio(new Node(1));
        lista.addInicio(new Node(2));
        lista.addInicio(new Node(3));

        lista.Print();
    }
}
