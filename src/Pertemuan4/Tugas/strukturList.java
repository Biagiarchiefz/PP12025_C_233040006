package Pertemuan4.Tugas;

public class strukturList {
    private Node Head;

    public strukturList () {
        this.Head = null;
    }

    public boolean isEmpty ()   {
        return Head == null;
    }


    public void addTail(double data) {
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

    public void addHead (double data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            Head = newNode;

        } else {
            newNode.setNext(Head);
            Head = newNode;
        }
    }


    public void addMid(double data, double position) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
        }

        else {
            Node curNode = Head;
            if (position == 1) {
                newNode.setNext(curNode);
                Head = newNode;
            }

            else {
                Node posNode = null;
                int i = 1;

                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }

                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }



    public void displayElement() {
        Node curNode =  Head;
        while (curNode != null ) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
