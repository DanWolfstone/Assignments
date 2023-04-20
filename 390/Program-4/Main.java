import javafx.scene.Node;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//node object and Scanner init
		Node node = new Node();
		Scanner input = new Scanner(System.in);

		
		// node.showList(); //Test to see if the nodes had initialize

	
	//Text Menu 
	System.out.println("How many nodes would you like in your list? Please enter:  ");
	int length = input.nextInt(); // Desired length
		node.init();
		for(int i = 0; i < length; i++){
			node.addToEnd(i);
		}
		System.out.println("Node List:   ");
		node.showList();

	// Menu 2
	int option = 0;
		while(option != 3){
		System.out.println("Select one of the following or press 3 to exit");
		System.out.println("    1: Add a node in between nodes. ");
		System.out.println("    2: Delete a Node. ");
		System.out.println("    3: Exit Program. ");
		option = input.nextInt(); // Make a choice
		}
		if(option == 1){
			System.out.println("Which node should this be placed after:   ");
			int addAfterNode = input.nextInt();
			System.out.println("Value of Node to be placed:    ");
			int nodeValue = input.nextInt();
			// Put it all together
			node.addAfter(node.findNode(addAfterNode), nodeValue);
			System.out.println("Your New list:    ");
			node.showList();
		}
		else if(option == 2) {
			System.out.println("Enter the node after the one you'd like to delete:   ");
				int deleteAfterNode = input.nextInt();
				// Put it all together
				node.deleteAfter(node.findNode(deleteAfterNode));
				System.out.println("Your New list:    ");
				node.showList();
		}
		else if(option == 3){
			System.out.println("Exiting... ");
			return;
		}
		input.close();
	}
}
