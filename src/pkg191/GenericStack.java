/*
 * Project: Java 2 Programming exercise 19.1 
 * Name: Lauren Smith
 * Date: 3/2/21
 * Description: Modified listing 19.1 GenericStack class to be an array instead of ArrayList 
 */

package pkg191;


//generic class GenericStack
public class GenericStack<E> {
    //makes object array elements  
    private Object[] elements=new Object[10];
    //makes object array newArr in case elements is full 
    private Object[] newArr; 
    //method to return the number of elements in the stack 
    public int getSize() 
    {
        //int to be a placeholder for index the array is filled to 
        int a=0;  
        //loops through whole array 
        for(int i=0; i<elements.length; i++) 
        {
            //if the elements at the index of i is null means it's empty 
            if(elements[i]==null) 
            {
                //last filled index is that index-1 since the previous index is filled 
                a= i-1; 
            }
        } 
        //returns a. if no items are null method returns 0 
        return a; 
    } 
    
    //returns the elements at the top of the stack 
    public E peek() 
    { 
        //returns the element at the index getSize() returns as that shows the 
        //last filled index of the array 
        return (E)elements[getSize()]; 
    } 
    
    //adds an item to the stack 
    public void push(E o) 
    {
        //if getSize() returns 0 that means array is full 
        if(getSize()==0) 
        {
            //inits newArr to be double the size of full array 
           newArr=new Object[elements.length*2]; 
           //clones old array into newArr 
           newArr=elements.clone();
           //sets elements length+1 in new array to the added object for stack
           newArr[elements.length+1]=o; 
        }  
        //if the array isn't full, set element to index of getSize()+1 in elements array
        else 
        {
            elements[getSize()+1]=o; 
        }
    } 
    
    public boolean isEmpty() 
    {
        //loops through the elements array 
        for(int i=0; i<elements.length; i++) 
        {
            //if any element isn't null it's not empty so return false 
            if(elements[i]!=null) 
            {
                return false; 
            }
        } 
        //else return true 
        return true; 
    }
    
}
