import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();

//        BST tree = new BST();
//        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        tree.populateSorted(nums);
//        tree.display();

//        AVLTREE tree = new AVLTREE();
//        for (int i = 0; i < 1000; i++) {
//            tree.insert(i);
//        }
//        System.out.println(tree.height());
//        tree.prettyTreeDisplay();


            int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
            SegmentTree tree = new SegmentTree(arr);
//            tree.display();

        System.out.println(tree.query(1, 6));
    }
}