import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

        BST tree = new BST();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        tree.populateSorted(nums);
        tree.display();
    }
}