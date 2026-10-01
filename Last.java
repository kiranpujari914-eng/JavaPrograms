class LL{
    Node head;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// insert at the end 

public void insertatend(int data){
    Node newnode = new Node(data);

    if(head == null){
        head = newnode;
        return;
    }

    Node currnode = head;

    while(currnode.next != null){
        currnode = currnode.next;
    }

    currnode.next = newnode;
}

public void printList(){
    System.out.print("Head" + "->" ); 

    if (head == null)
        {
            System.out.print("List is Empty");
            return ;
        }
        Node currNode = head;
        while (currNode != null)
            { 
                System.out.println(currNode.data + "-> ");
               currNode = currNode.next;

               
            }

            System.out.println("Null");
    }










public static void main(String[] args){
    LL list = new LL();


    list.insertatend(56);

    
    list.printList();

}



}


