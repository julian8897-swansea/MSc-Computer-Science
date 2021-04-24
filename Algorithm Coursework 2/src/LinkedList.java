//Class for linked list
public class LinkedList
{
	Node head;    

	//Method to append node at the front of the linked list
	public void push(int newData)
	{
		//Create a new node and store the new information
		Node newNode = new Node(newData);

		//Set the next node as the head node
		newNode.nextNode = head;

		//Make the newly created node as the head node
		head = newNode;
	}
	
	 /* Returns count of nodes in linked list */
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
	
	//toString Method to print information of linked list
	public String toString() {
		String output = "Start of Linked List:\n";
		Node tmpNode = head;
		while (tmpNode.nextNode != null) {
			output += tmpNode + "\n";
			tmpNode = tmpNode.nextNode;
		}
		output += tmpNode + "\n";
		output += "End of Linked List";		
		return output;
	}

	//Driver function to test the above functions
	public static void main(String args[])
	{

		//Start with the empty list
		LinkedList llist = new LinkedList();

		/*Use push() to construct below list
        14->21->11->30->10  */
		llist.push(10);
		llist.push(30);
		llist.push(11);
		llist.push(21);
		llist.push(14);

		System.out.println(llist);



	}
}