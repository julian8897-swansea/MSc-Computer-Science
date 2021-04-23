//Class for node of linked list
public class Node {
	int data;
    Node nextNode;
    
    //constructor
    public Node(int data)
    {
        this.data = data;
        nextNode = null;         
    }
    
    //toString method to print node information
    public String toString() {
		return String.format("Node Information: %d", data);
	}

}
