package Pertemuan2;

public class Latihan_2a {

    public static void main(String[] args) {

        // membuat 2 buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // membuat relasi node n1 dan n2
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);


        // Menampilkan node n1 dan n2 dengan Pointer p
        Node p = n1;
        while (p != null) {
            System.out.printf("%d ",p.getNilai());
            p = p.getNext();
        }
    }

}
