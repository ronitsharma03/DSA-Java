
import com.sun.source.tree.Tree;

import java.util.*;

public class BFS {
    public List<List<Integer>> levelorder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }

        return result;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            // list has a index specifying method so add it in front everytime
            result.add(0, currentLevel);
        }

        return result;
    }


//    Leetcode problem: 993 -> https://leetcode.com/problems/cousins-in-binary-tree/description/
    public boolean isCousin(TreeNode root, int x, int y){
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                (level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy))
                );
    }

    public TreeNode findNode(TreeNode node, int x){
        if(node == null){
            return null;
        }

        if(node.val == x){
            return node;
        }
        TreeNode n = findNode(node.left, x);
        if(n != null){
            return n;
        }

        return findNode(node.right, x);
    }

    public boolean isSibling(TreeNode node, TreeNode y, TreeNode z){
        if(node == null){
            return false;
        }

        return (
                (node.left == y && node.right == z) || (node.left == z && node.right == y) || isSibling(node.left, y, z) || isSibling(node.right, y, z)
                );
    }

    public int level(TreeNode node, TreeNode x, int lev){
        if(node == null){
            return 0;
        }

        if(node == x){
            return lev;
        }

        int level = level(node.left, x, lev+1);
        if(level != 0){
            return level;
        }

        return level(node.right, x, lev+1);
    }

    // Leetcode 101 -> https://leetcode.com/problems/symmetric-tree/description/
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if(root == null){
                return true;
            }
            // Queue<TreeNode> queue = new LinkedList<>();
            // queue.add(root.left);
            // queue.add(root.right);
            // while(!queue.isEmpty()){
            //     TreeNode left = queue.poll();
            //     TreeNode right = queue.poll();

            //     if(left == null && right == null){
            //         continue;
            //     }
            //     if(left == null || right == null){
            //         return false;
            //     }

            //     if(left.val != right.val){
            //         return false;
            //     }
            //     queue.add(left.left);
            //     queue.add(right.right);
            //     queue.add(left.right);
            //     queue.add(right.left);
            // }
            // return true;
            // 2nd approach - recursion
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            if (left.val != right.val) {
                return false;
            }
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }

    // 104 -> https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);

    }

    // 226 -> https://leetcode.com/problems/invert-binary-tree/
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    // 543 -> https://leetcode.com/problems/diameter-of-binary-tree/description/
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode node){
        if(node == null){
             return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int d = leftHeight + rightHeight;
        diameter = Math.max(d, diameter);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public TreeNode findSuccessor(TreeNode root, int key){
        if(root == null){
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            if(currNode.left != null) queue.offer(currNode.left);
            if(currNode.right != null) queue.offer(currNode.right);
            if(currNode.val == key) break;
        }
        return queue.poll();
    }



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Deque<TreeNode> deq = new LinkedList<>();
        boolean reverse = false;
        deq.offer(root);

        while (!deq.isEmpty()) {
            int levelSize = deq.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                if(!reverse) {
                    TreeNode currentNode = deq.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) deq.addLast(currentNode.left);
                    if (currentNode.right != null) deq.addLast(currentNode.right);
                }else{
                    TreeNode currentNode = deq.pollLast();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) deq.addFirst(currentNode.left);
                    if (currentNode.right != null) deq.addFirst(currentNode.right);
                }
            }
            reverse = !reverse;
            list.add(currentLevel);
        }
        return list;
    }

    // Leetcode - 116
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    public TreeNode connect(TreeNode root) {
        if(root == null) return null;

        TreeNode leftMost = root;

        while(leftMost.left != null){
            TreeNode currentNode = leftMost;
            while(currentNode != null){
                currentNode.left.next = currentNode.right;
                if(currentNode.next != null){
                    currentNode.right.next = currentNode.next.left;
                }
                currentNode = currentNode.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode next;
        private TreeNode root;

        public TreeNode(TreeNode node){
            this.root = node;
        }
    }
}
