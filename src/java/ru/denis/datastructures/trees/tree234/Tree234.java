package ru.denis.datastructures.trees.tree234;

public class Tree234 {
    private Node root = new Node();

    public int find(int key) {
        Node curNode = root;
        int childNumber;
        while (true) {
            if ((childNumber = curNode.findItem(key)) != -1) {
                return childNumber;
            } else if (curNode.isLeaf()) {
                return -1;
            } else {
                curNode = getNextChild(curNode, key);
            }
        }
    }
    public void insert(int dValue) {
        Node curNode = root;
        DataItem tempItem = new DataItem(dValue);
        while (true) {
            if (curNode.isFull()) {
                split(curNode);
                curNode = curNode.getParent();
                curNode = getNextChild(curNode, dValue);
            } else if (curNode.isLeaf()) {
                break;
            } else {
                curNode = getNextChild(curNode, dValue);
            }
        }
        curNode.insertItem(tempItem);
    }
    public void split(Node thisNode) {
        DataItem itemB, itemC;
        Node parent, child2, child3;
        int itemIndex;

        itemC = thisNode.removeItem();
        itemB = thisNode.removeItem();
        child2 = thisNode.disconnectChild(2);
        child3 = thisNode.disconnectChild(3);
        Node newRight = new Node();

        if (thisNode == root) {
            root = new Node();
            parent = root;
            root.connectChild(0, thisNode);
        } else {
            parent = thisNode.getParent();
        }
        itemIndex = parent.insertItem(itemB);
        int num = parent.getNumItems();

        for (int i = num - 1; i > itemIndex ; i--) {
            Node temp = parent.disconnectChild(i);
            parent.connectChild(i + 1, temp);
        }
        parent.connectChild(itemIndex + 1, newRight);

        newRight.insertItem(itemC);
        newRight.connectChild(0, child2);
        newRight.connectChild(1, child3);
    }
    public Node getNextChild(Node theNode, int theValue) {
        int index;
        int numItems = theNode.getNumItems();
        for (index = 0; index < numItems; index++) {
            if (theValue < theNode.getItem(index).dData) {
                return theNode.getChild(index);
            }
        }
        return theNode.getChild(index);
    }
    public void displayTree() {
        recDisplayTree(root, 0 , 0);
    }
    private void recDisplayTree(Node thisNode, int level, int childNumber) {
        System.out.print("level = " + level + " child = " + childNumber + " ");
        thisNode.displayNode();
        int numItems = thisNode.getNumItems();
        for (int i = 0; i < numItems + 1; i++) {
            Node nextNode = thisNode.getChild(i);
            if (nextNode != null) {
                recDisplayTree(nextNode, level + 1, i);
            } else {
                return;
            }
        }
    }
}
