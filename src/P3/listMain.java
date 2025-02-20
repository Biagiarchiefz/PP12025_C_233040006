package P3;

public class listMain {
    public static void main(String[] args) {
        strukturList testA = new strukturList();

        testA.addTail(3);
        testA.addTail(4);
        testA.addTail(5);

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

        Test5A.addHead(3);
        Test5A.addHead(2);
        Test5A.addHead(1);

        System.out.print("Element : ");
        Test5A.diplayElement();

        System.out.println("\n");
        strukturList Test5B = new strukturList();

        Test5B.addHead(1);
        Test5B.addHead(4);
        Test5B.addHead(5);
        Test5B.addHead(7);

        System.out.print("Element : ");
        Test5B.diplayElement();


    }
}
