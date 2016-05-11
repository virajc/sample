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
		printLinkList(llist);
		llist = addLast(llist, 30);
		printLinkList(llist);
		llist = addafter(llist, 35, secondNode);
		printLinkList(llist);
		llist = addbefore(llist, 40, 8);
		printLinkList(llist);

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
