import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTree {

    public BinaryTree(){

    }


    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert Nodes
    public void populate(Scanner scanner){
        System.out.println("Enter the root node value: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert at the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Insert the value for the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert at the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void prettyDisplay(){
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level + 1);

        if(level != 0){
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }

    // Pretty Tree Display
//    public void prettyTreeDisplay() {
//        printPretty(root);
//    }
//
//    private void printPretty(Node root) {
//        int maxLevel = maxLevel(root);
//        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
//    }
//
//    private void printNodeInternal(List<Node> nodes, int level, int maxLevel) {
//        if (nodes.isEmpty() || isAllElementsNull(nodes))
//            return;
//
//        int floor = maxLevel - level;
//        int edgeLines = (int) Math.pow(2, Math.max(floor - 1, 0));
//        int firstSpaces = (int) Math.pow(2, floor) - 1;
//        int betweenSpaces = (int) Math.pow(2, floor + 1) - 1;
//
//        printWhitespaces(firstSpaces);
//
//        List<Node> newNodes = new ArrayList<>();
//        for (Node node : nodes) {
//            if (node != null) {
//                System.out.print(node.value);
//                newNodes.add(node.left);
//                newNodes.add(node.right);
//            } else {
//                newNodes.add(null);
//                newNodes.add(null);
//                System.out.print(" ");
//            }
//
//            printWhitespaces(betweenSpaces);
//        }
//        System.out.println("");
//
//        for (int i = 1; i <= edgeLines; i++) {
//            for (int j = 0; j < nodes.size(); j++) {
//                printWhitespaces(firstSpaces - i);
//                if (nodes.get(j) == null) {
//                    printWhitespaces(edgeLines + edgeLines + i + 1);
//                    continue;
//                }
//
//                if (nodes.get(j).left != null)
//                    System.out.print("/");
//                else
//                    printWhitespaces(1);
//
//                printWhitespaces(i + i - 1);
//
//                if (nodes.get(j).right != null)
//                    System.out.print("\\");
//                else
//                    printWhitespaces(1);
//
//                printWhitespaces(edgeLines + edgeLines - i);
//            }
//
//            System.out.println("");
//        }
//
//        printNodeInternal(newNodes, level + 1, maxLevel);
//    }
//
//    private void printWhitespaces(int count) {
//        for (int i = 0; i < count; i++)
//            System.out.print(" ");
//    }
//
//    private int maxLevel(Node node) {
//        if (node == null)
//            return 0;
//        return Math.max(maxLevel(node.left), maxLevel(node.right)) + 1;
//    }
//
//    private boolean isAllElementsNull(List<Node> list) {
//        for (Object object : list) {
//            if (object != null)
//                return false;
//        }
//        return true;
//    }
}
