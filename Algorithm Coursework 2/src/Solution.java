public class Solution {
    //Initializing a linked list
	LinkedList linkedlist = new LinkedList();
	DoublyLinkedList dlinkedlist = new DoublyLinkedList();
	
    public Solution() {
        // Your code here - initiate any class variables required for each solution
    }

    public int lessThan(int value, boolean flag) {
        // Your code here - you must return an integer
    	//possibly use linkedlist
    	//initially wanted to use arrays, but inserting an element is inefficient, used linked list traversal instead
    	
    	if (flag == false) {
    		
    		linkedlist.push(value);
    		return -1;
    		
    	} else if (flag == true) {
    		
    		//Set the current node as head
    		Node currentNode = linkedlist.head; 
    		//counter
            int counter = 0;
            
            //Traversing the linked list
            while (currentNode != null) {
            	//if the data of the current node is less than or equals
            	//to the given value, increase counter by 1     	
                if (currentNode.data <= value)
                    counter++;
                currentNode = currentNode.nextNode;
            }
            //adds the new value to the linked list via push
            linkedlist.push(value);
            return counter;
    		
    	}
    	return 0;
    }

    public int magic(int value, boolean flag) {
        // Your code here - you must return an integer
    	//Wanted to use singlylinked list, wont cut it as need access 
    	//to previous node to calculate magic number
    	//needs to get the length of linked list
    	int magicNum;
//    	int counter = 0;
    	
    	if (flag == false) {
    		
    		dlinkedlist.push(value);
//    		counter++;
    		return -1;
    		
    	} else if (flag == true) {
    		
    		dlinkedlist.push(value);
//    		counter++;
    		
    		//Set the current node as head
    		DoublyLinkedList.Node slowPtr = dlinkedlist.head; 
    		DoublyLinkedList.Node fastPtr = dlinkedlist.head; 
    		
    		 if (dlinkedlist.head != null)
    	        {
    	            while (fastPtr!= null && fastPtr.nextNode != null)
    	            {
    	                fastPtr = fastPtr.nextNode.nextNode;
    	                slowPtr = slowPtr.nextNode;
    	            }
    	            
    	            //magic number for odd elements
//    	            if ((counter % 2) == 1) {
//    	            	magicNum = slowPtr.data;
//    	            	return magicNum;
//    	            	
    	            if ((dlinkedlist.getCount() % 2) == 0) {
    	            	magicNum = (slowPtr.data + slowPtr.prevNode.data)*dlinkedlist.getCount();
    	            	return magicNum;
    	            	
    	            } else if ((dlinkedlist.getCount() % 2) == 1) {
    	            	magicNum = slowPtr.data;
    	            	return magicNum;
    	            }
    	          
//    	            System.out.println("The middle element is [" +
//    	                                slowPtr.data + "] \n");
    	        }
            
    		
          }
   
    	//System.out.println(counter);
        return 0;
    }

//    // ??? should be changed to represent your linked list structure
//    public ??? convertToLinkedList(int[] data) {
//        // Your code here - you must return a linked list
//        return linkedList;
//    }
//
//    public int[] whenDidILost(??? linkedList) {
//        // Your code here - you must return an int array
//        return linkedList;
//    }    
}