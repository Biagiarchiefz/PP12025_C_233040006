package Pertemuan3;

public class strukturList {
    private Node Head;

    public strukturList () {
        this.Head = null;
    }

    public boolean isEmpty ()   {
        return Head == null;
    }


    public void addTail(int data) {
        Node posNode = null, curNode = null;

        Node newnode = new Node(data);
        if (isEmpty()) {
            Head = newnode;
        } else {
            curNode = Head;
            while (curNode != null ) {
                posNode = curNode;
                curNode = curNode.getNext();

            }
            posNode.setNext(newnode);
        }
    }

    public void addHead (int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            Head = newNode;

        } else {
            newNode.setNext(Head);
            Head = newNode;
        }
    }

    public void diplayElement() {
        Node curNode =  Head;
        while (curNode != null ) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }


}