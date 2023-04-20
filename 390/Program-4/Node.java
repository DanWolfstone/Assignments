class Node {
	// Global Vars
	int data;
	Node next;
	Node front;

	//Initialize Node
	public void init() {
		front = null;
	}

	public Node makeNode(int data) {
		Node newNode = new Node();
		//Assign data
		newNode.data = data;
		//Next should be null
		newNode.next = null;
		return newNode;
	}

	public Node findTail() {
		//Create node aND set to front
		Node current = front;
		//Loop through until null
		while(current.next != null) {
			current = current.next;
		}
		return current;
	}

	public void addToEnd(int data) {
		Node tail = new Node();

		//Front =/= Null, if so set the front to our data
		if(front == null){ front = makeNode(data); }
		else {
			tail =findTail();
			tail.next = makeNode(data);
		}
	}

	public void addAfter(Node spot, int data) {
		// new node is our data
		Node newNode = makeNode(data); 		 
		newNode = spot.next;			// Link to the next spot
		spot.next = newNode.next;	// link to new node
	}

	public void deleteAfter(Node spot) {
		Node nextNode = new Node(); 	// to be deleted
		nextNode = spot.next;					// nextNode is now next node
		spot.next = nextNode.next;			// Set next spot to be after
	}

	public void showList(){
		Node current = front;

		while(current != null) {
			System.out.println(current.data); // Print node
			current = current.next;				// node++;
		 } //EndNode
	}

	public Node findNode(int addAfterNode) {
		Node current = front;
		// Keep searching current node =/= key
		while(current.data != addAfterNode){
			current = current.next;
		}
		return current;
	}
}
