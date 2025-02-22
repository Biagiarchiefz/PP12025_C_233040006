package Pertemuan3;

public class listMain {
    public static void main(String[] args) {

        strukturList test = new strukturList();

        test.addTail(3);
        test.addTail(4);
        test.addTail(5);

        System.out.print("Element : ");
        test.diplayElement();

        System.out.println("\n");

        strukturList testA = new strukturList();

        testA.addTail(3);
        testA.addTail(2);
        testA.addTail(1);

        System.out.print("Element : ");
        testA.diplayElement();

        System.out.println("\n");

        strukturList TestB = new strukturList();

        TestB.addTail(1);
        TestB.addTail(4);
        TestB.addTail(5);
        TestB.addTail(7);

        System.out.print("Element : ");
        TestB.diplayElement();


        System.out.println("\n");
        strukturList Test5A = new strukturList();

        Test5A.addHead(1);
        Test5A.addHead(2);
        Test5A.addHead(3);

        System.out.print("Element : ");
        Test5A.diplayElement();

        System.out.println("\n");
        strukturList Test5B = new strukturList();

        Test5B.addHead(7);
        Test5B.addHead(5);
        Test5B.addHead(4);
        Test5B.addHead(1 );

        System.out.print("Element : ");
        Test5B.diplayElement();

        System.out.println("\n");
        strukturList Test2 = new strukturList();

        Test2.addHead(5);
        Test2.addHead(4);
        Test2.addHead(3);

        System.out.print("Element : ");
        Test2.diplayElement();




    }

}
