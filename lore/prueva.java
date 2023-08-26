class Nodo {
    int valor;
    Nodo next;

    public Nodo() {

    }
}

public class prueva {
    public static void main(String[] args) {
        int i = 0;
        Nodo tmp = null;
        Nodo algo = null;

        while (i < 50) {
            algo = tmp;
            tmp = new Nodo();
            tmp.valor = (i + 1);
            tmp.next = algo;
            i++;

        }

        while (i > 0) {
            System.out.println(tmp.valor);
            tmp = tmp.next;
            i--;
        }

    }
}
