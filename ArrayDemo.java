public class ArrayDemo 
{
    public static void main(String[] args) 
    {
        Myarray myarray = new Myarray();
        
       System.out.println("Intial array");
        myarray.printElements();

        myarray.insertAtend(10);
        myarray.insertAtend(20);

        System.out.println("After insert");
        System.out.println();

        myarray.insertAtStart(5);
        System.out.println("After inserting 5 at start");
        System.out.println();

        //invalid position

        myarray.insertAtAnyposition(-1, 99);
        myarray.insertAtAnyposition(7, 100);
        System.out.println("inserting at invalid positions");
        System.out.println();

        
    }
}
