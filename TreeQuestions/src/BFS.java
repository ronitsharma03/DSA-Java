
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
            list.add(currentLevel);
        }
        return list;
    }

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        private TreeNode root;

        public TreeNode(TreeNode node){
            this.root = node;
        }
    }
}
