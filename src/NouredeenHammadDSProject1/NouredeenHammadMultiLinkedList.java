package NouredeenHammadDSProject1;

import java.util.ArrayList;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadMultiLinkedList<T> {

    private NouredeenHammadNode<T> head;

    //Adds a new Node to the MultiLinkedList
    void addNode(int column, T value) {
        NouredeenHammadNode newNode = new NouredeenHammadNode(column, value);

        //If the MultiLinkedList is empty, place the new node as the head node
        if (head == null) {
            head = newNode;
            return;
        }

        //Gets the base node of that column
        NouredeenHammadNode base = findBaseNode(newNode.getColumn());

        //Makes a temp node and moves it all the way to the right
        NouredeenHammadNode temp = head;
        while (temp.getRight() != null) {
            temp = temp.getRight();
        }

        //if the findBaseNode function returns null, it means that that column
        //does not have any nodes yet, so it adds the new node to the right.
        //And if it returns a base node, it sends it to addToTop function
        if (base == null) {
            temp.setRight(newNode);
        } else {
            addToTop(base, newNode);
        }

        //After the node is added, checkMerge checks if there are blocks that
        //can be merged together in that column
        checkMerge(newNode.getColumn());
    }

    //Returns the base node of the given column or returns null if the column is empty
    NouredeenHammadNode findBaseNode(int column) {
        NouredeenHammadNode temp = head;
        NouredeenHammadNode base = null;

        //Checks the column data of each node to the right
        while (temp != null) {
            if (temp.getColumn() == column) {
                base = temp;
            }
            temp = temp.getRight();
        }
        return base;
    }

    //Takes a base node and navigates to the top of its column and adds the new node
    void addToTop(NouredeenHammadNode baseNode, NouredeenHammadNode newNode) {
        NouredeenHammadNode temp = baseNode;

        //Navigates to the top and adds the new node
        if (temp.getUp() == null) {
            temp.setUp(newNode);
        } else {
            while (temp.getUp() != null) {
                temp = temp.getUp();
            }
            temp.setUp(newNode);
        }
    }

    //Checks if there are blocks that can be merged in that column, and merges them
    void checkMerge(int column) {
        //singleMerge function will keep running as long as it returns true
        //It returns true when a merge is performed, and false if no mergeable blocks are found
        while (singleMerge(column)) {
        }
    }

    //Merges blocks that can be merged in that column, returns true if a merge is done
    //and returns false if no mergeable blocks are found
    boolean singleMerge(int column) {
        if (head == null) {
            return false;
        }

        boolean mergeDone = false;

        //Finds the base of the column
        NouredeenHammadNode base = findBaseNode(column);

        //Checks if the column is at least 2 blocks tall
        if (base.getUp() == null) {
            return false;
        }

        //Creates two temp nodes and navigates them to the top of the column
        NouredeenHammadNode lower_temp = base;
        NouredeenHammadNode upper_temp = base.getUp();

        while (upper_temp.getUp() != null) {
            upper_temp = upper_temp.getUp();
            lower_temp = lower_temp.getUp();
        }

        //Compares the two temp nodes and merges them.
        //It doubles the lower_temp's value and nullifies its .up node
        if ((int) lower_temp.getData() == (int) upper_temp.getData()) {
            lower_temp.setData(((int) lower_temp.getData()) * 2);
            lower_temp.setUp(null);
            upper_temp = null;
            mergeDone = true;
        }
        return mergeDone;
    }

    //Scans the whole MultiLinkedList and creates a Block object for each node,
    //places them in an ArrayList and returns it
    public ArrayList<NouredeenHammadBlock> returnGraphicsBlocks() {
        ArrayList<NouredeenHammadBlock> arr = new ArrayList<>();

        //return empty array
        if (head == null) {
            return arr;
        }

        NouredeenHammadNode temp = head;
        NouredeenHammadNode currentBase = null;
        boolean firstNode = true;
        int tempy = 0;

        do {
            //If this is the first iteration of the do-while loop,
            //temp will not navigate to the right
            if (firstNode) {
                firstNode = false;
            } else {
                temp = temp.getRight();
            }

            //Adds current node as a new Block object, the coordinates are modified
            //to be displayed correctly on the grid
            arr.add(new NouredeenHammadBlock((temp.getColumn() * 100) + 8, (700 - ((tempy + 1) * 100)) + 8, (Integer) temp.getData()));

            //Stores the current temp as the currentBase
            currentBase = temp;

            //Navigates up and adds new blocks for each node
            while (temp.getUp() != null) {
                temp = temp.getUp();
                tempy++;
                arr.add(new NouredeenHammadBlock((temp.getColumn() * 100) + 8, (700 - ((tempy + 1) * 100)) + 8, (Integer) temp.getData()));
            }

            //Resets the current temporary Y variable
            tempy = 0;

            //Brings the temp's position back down to the base
            temp = currentBase;

        } while (temp.getRight() != null);

        return arr;
    }
    
//THE FUNCTION BELOW WAS ONLY USED IN-DEVELOPMENT FOR TESTING PURPOSES

//    void printOne(int column, int row){
//        if(head==null) {System.out.println("Empty"); return;}
//        
//        Node base = findBaseNode(column);
//        Node temp = base;
//        
//        if(base == null){
//            System.out.println("Column empty");
//        } else {
//            for (int i = 0; i < row; i++) {
//                temp = temp.getUp();
//            }
//            System.out.println(temp.getData());
//        }
//    }
}
