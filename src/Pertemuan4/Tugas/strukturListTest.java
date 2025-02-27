package Pertemuan4.Tugas;

public class strukturListTest {
    public static void main(String[] args) {

        strukturList listA = new strukturList();
        listA.addTail(2.1);
        listA.addTail(4.5);
        listA.addMid(3.4, 2);

        System.out.print("Element = ");
        listA.displayElement();

        System.out.println("\n");
        strukturList listB = new strukturList();
        listB.addTail(2.1);
        listB.addTail(5.5);
        listB.addMid(4.5, 2);
        listB.addMid(1.1, 2);
        listB.addHead(3.4);

        System.out.print("Element = ");
        listB.displayElement();


    }
}
