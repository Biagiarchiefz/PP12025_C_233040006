package Pertemuan3;

public class strukturList {
    private Node HEAD;
    public strukturList () {
        this.HEAD = null;
    }
    public boolean isEmpty () {
        return HEAD == null;
    }
    public void addTail (int data)
    {
        Node posNode=null, curNode=null;

        Node newNode = new Node (data);
        if (isEmpty())
        {
            HEAD = newNode;
        }
        else
        {
            curNode = HEAD;
            while (curNode != null)
            {
                posNode = curNode;
                curNode = curNode.getnext();
            }
            posNode.setnext(newNode);
        }
    }


    public void addHead (int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        }
        else {
            newNode.setnext(HEAD);
            HEAD = newNode;
        }
    }


    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getdata()+ " ");
            curNode = curNode.getnext();		}
    }

}
