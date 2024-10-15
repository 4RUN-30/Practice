package fun;

public class LinkedList<E>{

    private Node head;
    private Node tail;

    private class Node{
        E data;
        Node next;

        Node(E data){
            this.data = data;
        }
    }

    public void add(E data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            tail = n;
        }else{
            tail.next = n;
            tail = n;
        }
    }

    @Override
    public String toString(){
        Node node = head;
        StringBuilder linkedList = new StringBuilder();
        while(node!=null){
            if(node.next!=null) linkedList.append(node.data + "->");
            else linkedList.append(node.data);
            node = node.next;
        }
        return new String(linkedList);
    }
}
