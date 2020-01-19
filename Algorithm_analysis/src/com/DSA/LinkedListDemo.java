package com.DSA;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> linkedLst = new LinkedList<Integer>();
		linkedLst.delete();
		linkedLst.addNode(15);
		linkedLst.addNode(8);
		linkedLst.addNode(9);
		linkedLst.addNode(7);
		linkedLst.addNode(6);
		linkedLst.addNode(7);
		linkedLst.addNode(3);
		linkedLst.delete();
		linkedLst.printLinkedList();
		LinkedList<String> linkString = new LinkedList<String>();
		linkString.addNode("AAA");
		linkString.addNode("BBB");
		linkString.addNode("CCC");
		linkString.addNode("DDD");
		linkString.addNode("EEE");
		linkString.addNode("FFF");
		linkString.addNode("JJJ");
		linkString.delete();
		linkString.printLinkedList();
	}

}
