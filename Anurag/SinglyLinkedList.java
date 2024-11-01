public class SinglyLinkedList {
    class Node{
        int data;
        Node next ;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    Node tail = null;

    void add_node(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
        }else{
            tail.next = node;
        }
        tail = node;

    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    void delete_node(int data){
        if(head == null){
            System.out.println("Linked list is empty");
        }else if (head.data == data) {
            head = head.next;
            
        }else{
            Node temp = head, prev = head;
            while (temp!=null && temp.data!=data){
                prev = temp;
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("No such item");
            }else{
                prev.next = temp.next; 

            }
        }
    }

    void insert_after(int data, int new_data){
        Node node = new Node(new_data);
        if(head == null){
            System.out.println("Linked list is empty");
        }else{
            Node temp = head;
            while(temp!=null && temp.data != data){
                temp = temp.next;
            }
            if(temp != null){
                node.next = temp.next;
                temp.next = node;
            }else{
                System.out.println("No such item");
            }
        }
    }
    
    public static void main(String[] args) {
        SinglyLinkedList s_linked_list = new SinglyLinkedList();
        s_linked_list.add_node(1);
        s_linked_list.add_node(2);
        s_linked_list.add_node(5);
        // s_linked_list.add_node(3);
        s_linked_list.display();
        s_linked_list.insert_after(2, 3);
        s_linked_list.insert_after(1, 6);
        s_linked_list.display();
        s_linked_list.delete_node(1);
        s_linked_list.display();
        s_linked_list.delete_node(3);
        s_linked_list.display();
        s_linked_list.delete_node(2);
        s_linked_list.display();
    }
}
