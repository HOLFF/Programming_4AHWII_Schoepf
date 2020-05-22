package Corona.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;

    public void add(int value){
        Node tmp=new Node(value);
        if (head == null) {
            head = tmp;
            return;
        }

        Node it;
        it = head;

        while (it.hasNext()) {
            it = it.next();
        }

        it.setNext(tmp);
        tmp.setLast(it);
    }


    public static void main(String[] args){

    }
}
