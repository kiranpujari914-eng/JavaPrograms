public class Myarray 
{   
    int[] array; //place to store elements
    int length; //total size of array
    int rightIndex;//pointing at empty box

    public Myarray()
    {
        length = 5;
        array = new int[length]; //[0] [0] [0]-->intial array
        rightIndex = 0;
    }

    //insertAtend

    public void insertAtend(int value)
    {
        if (rightIndex == length)
        {
            System.out.println("array is full");
            return ;
        }
        array[rightIndex] = value;
        rightIndex++; //after inserting at the end size go incresed
    }


    //insertAtStart

    public void insertAtStart(int value )
    {
        if (rightIndex == length)
        {
            System.out.println("array is full");
            return ;
        }
        else
        {
            //shift element one position to right

            for(int i = rightIndex - 1; i >= 0; i--)
            {
                array[i+1] = array[i];  
            }
        }

        //insert

        array[0] = value;
        rightIndex++;//
    }


    //insertAtAnyposition

    public void insertAtAnyposition(int value, int position)
    {
        if (rightIndex == length)
        {
            System.out.println("array is full");
            return ;
        }

        if (position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position");
            return ;
        }

        //shift and insert

        for (int i = rightIndex - 1; i >= position; i--)
        {
            array[i+1] = array[i]; 
        }
        array[position] = value;
        rightIndex++;
    }

    //print elements

    public void printElements()
    {
        System.out.println("index\tvalue");
        for (int i=0; i < length; i++)
        {
            System.out.println("i+ \t"+array[i]);
        }
        System.out.println("Size" + rightIndex);
        System.out.println();
            
    }   
   
}

