package Corona.LinkedList;

import java.util.ArrayList;

public class LinkedList {
    private Node head;

    public void add(){
        //default
    }

    public void add(int value) {
        Node tmp = new Node(value);

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
    }

    public void add(int pos, int value){
        Node tmp= new Node(value);
        try {
            int idx=1;
            if(head==null) head =tmp;
            if (pos<0)throw new NullPointerException("Argument smaller Zero");
            Node add= head;
            while(idx<pos){
                add=add.next();
                idx++;
            }
            if(add.hasNext()){
                tmp.setNext(add.next());
                add.setNext(tmp);
            }
            else{
                add.setNext(tmp);
                tmp.setNext(null);
            }
        }catch (NullPointerException E){
            E.printStackTrace();
        }

    }

    public void delete(int pos) {
        try {
        int idx=1;
        if(head==null) throw new NullPointerException("List empty");
        if (pos<0)throw new NullPointerException("Argument smaller Zero");
        if(pos==0){
            if(!head.hasNext()){
                head=null;
                return;
            }
            else {
                head = head.next();
                return;
            }
        }
        Node del=head;
            while(idx<pos){
                del=del.next();
                idx++;
            }
            if(del.next().hasNext()){
                del.setNext(del.next().next());
                return;
            }
            else{
                del.setNext(null);
            }
        }
        catch (NullPointerException E){
            E.printStackTrace();
        }

    }


    @Override
    public String toString() {
            String ret = "";
            if (head == null) return "()";
                Node it = head;
            while (it.hasNext()) {
                ret += "" + it.getValue() + " ";
                it = it.next();
            }
            ret += "" + it.getValue() + " ";
            return ret;

    }







    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        /*
        ll.add(4);
        ll.add(6);
        ll.add(8);
        ll.add(12);
        ll.add(54);
        ll.add(14);
        ll.add(89);
        ll.add(73);
        ll.add(17);
        */
        System.out.println(ll);
        ll.delete(-1);
        ll.delete(0);
        ll.delete(4);
        System.out.println(ll);

//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(4);
//		ArrayList<Integer> pointer = al;
//		for (int i = 0; i < pointer.size(); i++) {
//			System.out.println(pointer.get(i));
//		}
    }
}
