/**
 * Listas ou Linked List é uma estrutura de dados linear onde cada
 * elemento (node) aponta para o próximo. É composta por nós, onde
 * cada nó contém um valor e uma referência para o próximo nó.
 */

// Exemplo:
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListExample {
    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//
//        // imprimindo a lista
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            current = current.next;
//        }
        int[] numbers = {1, 2, 3, 4, 5};

        simpleLinkedList(numbers);
    }

    /**
     * Exercício:
     * Crie uma lista encadeada simples que permita adicionar
     * elementos no final e imprimir os elementos da lista.
     */
    public static void simpleLinkedList(int[] nums) {
        class LinkedList {
            Node head; // inicio da lista

            // método para adicionar um elemento ao final da lista
            public void add(int value) {
                Node newNode = new Node(value);
                if (head == null) {
                    // se lista estiver vazia o novo nó é o primeiro
                    head = newNode;
                } else {
                    Node current = head;

                    // percorre até o último nó
                    while (current.next != null) {
                        current = current.next;
                    }
                    current.next = newNode; // adiciona novo nó ao final
                }
            }

            // Método para imprimir os elementos da lista
            public void print() {
                Node current = head;
                while (current != null) {
                    System.out.println(current.data);
                    current = current.next;
                }
            }
        }
        LinkedList list = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            // Adiciona os elementos do array na lista
            list.add(nums[i]);
        }
        list.print();
    }
}
