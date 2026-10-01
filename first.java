class first
{
    
    Node Head;
    class Node
    {
        
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }

    }


    //Add at First

    public void Addatfirst(int data)
    {
        
        Node newnode = new Node(data);

    if(Head == null)
        {
            Head = newnode;
            return;
        }

        newnode.next = Head;
        Head = newnode;
    }


    //Printlist

    public void printlist()
    {

        System.out.print("Head" + "->");
        if(Head == null)
        {
            System.out.println("NULL");
            return;
        }

        Node monkey = Head;

        System.out.print("Head " + "->");

        while(monkey !=null)
            {
            
            System.out.print(monkey.data + " -> ");
            monkey = monkey.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args)
    {
        first list = new first();
        list.printlist();

        list.Addatfirst(56);
        list.printlist();

        list.Addatfirst(79);
        list.printlist();

        list.Addatfirst(107);
        list.printlist();

        list.Addatfirst(108);
        list.printlist();

     
    }
}