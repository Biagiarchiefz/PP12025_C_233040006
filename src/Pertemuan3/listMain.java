package Pertemuan3;

public class listMain {
    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);

        System.out.println("Elemen: ");
        list.displayElement();
    }

}
