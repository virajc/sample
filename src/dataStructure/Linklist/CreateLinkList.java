package dataStructure.Linklist;

import dataStructure.Linklist.LinkList;
import dataStructure.Linklist.LinkList.Node;

public class CreateLinkList {
	public static void main(String[] args) {
		LinkList llist = new LinkList();
		
		llist.head = new Node(5);
		Node secondNode = new Node(10);
		Node thirdNode = new Node(15);
		
		llist.head.next = secondNode;
		secondNode.next = thirdNode;
		
		
		printLinkList(llist);
		llist = add(llist, 8);
		//printLinkList(llist);
		llist = addLast(llist, 30);
		llist = addLast(llist, 50);
		llist = addLast(llist, 38);
		//printLinkList(llist);
		llist = addafter(llist, 35, secondNode);
		//printLinkList(llist);
		llist = addbefore(llist, 40, 8);
		//printLinkList(llist);
		llist = deletenode(llist, 40 );
		//printLinkList(llist);
		llist = deletenodewithkey(llist, 3);
		//printLinkList(llist);
		//System.out.println(getListCount(llist));
		//System.out.println(getListCountRecursive(llist.head));
		//partial wrong for passing list as argument
		//llist = swapNodeWithoutData(llist, 10,30);
		printLinkList(llist);
		llist = reverseList(llist);
		printLinkList(llist);

	}

	private static LinkList reverseList(LinkList list) {
		  Node prev = null;
	        Node current = list.head;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        
	        list.head = prev;
	        return list;
	}

	private static LinkList swapNodeWithoutData(LinkList list, int i, int j) {
		if(i==j)
		{
			return list;
		}
		Node temp = list.head;
		Node xPrev,xCurr,xNext;
		
		while(temp.next.data != i)
		{
			temp = temp.next;
		}
		
		xPrev = temp;
		xCurr = temp.next;
		xNext = xCurr.next;
		Node yPrev,yCurr,yNext;
		temp = list.head;
		while(temp.next.data != j)
		{
			temp = temp.next;
		}
		
		
		yPrev = temp;
		yCurr= temp.next;
		yNext = yCurr.next;

		if(xCurr == null || yCurr == null)
		{
			return list;
		}
		
		if (xPrev != null)
            xPrev.next = yCurr;
        else //make y the new head
            list.head = yCurr;
 
        // If y is not head of linked list
        if (yPrev != null)
            yPrev.next = xCurr;
        else // make x the new head
            list.head = xCurr;
 
        // Swap next pointers
        temp = xCurr.next;
        xCurr.next = yCurr.next;
        yCurr.next = temp;
		
		
		return list;
	}

	private static int getListCount(LinkList list) {
		int count  ;
		Node temp = list.head;
		for (count = 0; temp!=null; count++) {
			temp = temp.next;
		}
		return count;
	}
	private static int getListCountRecursive(Node head) {
		if(head==null)
		{
			return 0;
		}
		return getListCountRecursive(head.next)+1; 
	}

	private static LinkList deletenode(LinkList list, int nodeValue) {
		Node temp = list.head;
		Node deletedNode ;
		if(temp.data == nodeValue)
		{
			list.head = list.head.next;
		}
		else{
		while(temp.next.data!= nodeValue)
		{
			temp = temp.next;
		}
		deletedNode = temp.next;
		temp.next = deletedNode.next;
		deletedNode = null;
		}
		return list;
	}
	private static LinkList deletenodewithkey(LinkList list, int key) {
		Node temp = list.head;
		if(key==0)
		{ 
			list.head = temp.next;   // Change head
			return list;
		}
		 for (int i=0; temp!=null && i<key-1; i++)
		 {
			 temp = temp.next;
		 }
		 Node next = temp.next.next;
		 temp.next = next; 
		return list;
	}

	private static void printLinkList(LinkList list) {
		Node temp = list.head;
		System.out.print("List = ");
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}		
		System.out.println();
	}

	private static LinkList add(LinkList list, int data) {
		Node newNode = new Node(data);
		newNode.next = list.head;
		list.head = newNode;
		return list;
	}
	private static LinkList addLast(LinkList list, int data) {
		Node newNode = new Node(data);
		Node temp = list.head;
		
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = newNode;
		return list;
	}
	
	private static LinkList addafter(LinkList list, int data, Node afterNode) {
        Node new_node = new Node(data);
        new_node.next = afterNode.next;
        afterNode.next = new_node;
        return list;
	}
	private static LinkList addbefore(LinkList list, int data, int beforeNode) {
		Node new_node = new Node(data);
		Node temp = list.head;
		if(temp.data== beforeNode)
		{
			
			new_node.next = list.head;
			list.head = new_node;
			return list;
		}
		while(temp.next!=null && beforeNode != temp.next.data )
		{
			temp = temp.next;
		}
		new_node.next = temp.next;
		temp.next = new_node;
		/*beforeNode.next = new_node;*/
		return list;
	}
}
