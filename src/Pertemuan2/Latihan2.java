package Pertemuan2;

public class Latihan2 {

    public static void main(String[] args) {


        // membuat 2 buah node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        // membuat relasi node n1 dan n2
        n1.setNext(n2);

        // Menampilkan node n1 dan n2 dengan Pointer p
        Node p = n1;
        while (p != null) {
            System.out.println("%d" + p.getNilai());
            p = p.getNext();
        }
    }
}