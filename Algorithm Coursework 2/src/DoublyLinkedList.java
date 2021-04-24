
public class DoublyLinkedList {
	Node head; // head of list

	/* Doubly Linked list Node*/
	class Node {
		int data;
		Node prevNode;
		Node nextNode;

		// Constructor to create a new node
		// next and prev is by default initialized as null
		Node(int data) { 
			this.data = data; 
		}
	}

	// Adding a node at the front of the list
	public void push(int new_data){
		/* 1. allocate node
		* 2. put in the data */
		Node new_Node = new Node(new_data);

		/* 3. Make next of new node as head and previous as NULL */
		new_Node.nextNode = head;
		new_Node.prevNode = null;

		/* 4. change prev of head node to new node */
		if (head != null)
			head.prevNode = new_Node;

		/* 5. move the head to point to the new node */
		head = new_Node;
	}
	
	 public int getCount()
	    {
	        Node temp = head;
	        int counter = 0;
	        while (temp != null)
	        {
	            counter++;
	            temp = temp.nextNode;
	        }
	        return counter;
	    }

}

