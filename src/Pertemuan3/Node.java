package Pertemuan3;

public class Node {
    private int data;
    private Node next;

//	Inisialisasi atribut node

    public Node(int data) {
        this.data = data;
    }

    //	Setter & Getter
    public void setdata (int data) {
        this.data=data;

    }

    public int getdata() {
        return data;
    }
    public void setnext (Node next) {
        this.next = next;
    }
    public Node getnext() {
        return next;
    }

}
