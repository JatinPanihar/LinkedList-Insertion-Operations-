public class LinkedList_InsertionOperations {
    public static listnode head;
    public static class listnode{
        int data;
        int node;

        public listnode next;

        public listnode(int data){
          this.data = data;
          this.next=null;
        }
    }
    public static void display(){
        listnode current = head;
        while(current != null){
            System.out.println("Traversing List :-"+current.data);
            current=current.next;
        }
    }
    public static  void insertAtFirst(){
        listnode Newnode = new listnode(100);
        Newnode.next=head;
        head = Newnode;
    }
    public static void insertAtEnd(){
        listnode Newnode = new listnode(200);
        listnode current = head;
        while(null!=current.next){
           current = current.next;
        }
        current.next = Newnode;
    }
    public static void insertionAtAnyPosition(){
        listnode Newnode = new listnode(300);
        int position = 3;
        int count =1;
        listnode previous = head;
        while(count<position-1){
            previous = previous.next;
            count++;
        }
        listnode current = previous.next;
        previous.next = Newnode;
        Newnode.next = current;
    }

    public static void main(String[] args) {
        LinkedList_InsertionOperations llio = new LinkedList_InsertionOperations();
        llio.head=new listnode(12);
        listnode second = new listnode(23);
        listnode third = new listnode(34);
        listnode fourth = new listnode(45);

        llio.head.next = second;
        second.next = third;
        third.next = fourth;

        insertionAtAnyPosition();
        display();


    }
}
