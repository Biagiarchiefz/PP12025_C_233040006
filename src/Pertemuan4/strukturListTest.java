package Pertemuan4;

public class strukturListTest {


    public static void main(String[] args) {
        strukturList list = new strukturList();
        list.addTail(3);
        list.addTail(4);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addHead(5);

        System.out.print("Element = ");
        list.displayElement();


//
//        System.out.println("\n");
//
//        strukturList listA = new strukturList();
//        listA.addTail(1);
//        listA.addTail(5);
//        listA.addMid(4, 2);
//        listA.addMid(4, 2);
//        listA.addMid(3, 2);
//        listA.addHead(2);
//
//        System.out.print("Element = ");
//        listA.displayElement();



//        System.out.println("\n");
//
//        strukturList listB = new strukturList();
//        listB.addTail(4);
//        listB.addTail(5);
//        listB.addMid(5, 2);
//        listB.addMid(5, 2);
//        listB.addMid(1, 2);
//
//
//        listB.addHead(3);
//
//        System.out.print("Element = ");
//        listB.displayElement();



    }


}
