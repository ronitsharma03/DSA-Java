
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

    //    114 -> https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

    public void flatten(TreeNode root){
        TreeNode current = root;
        while(current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = current.left;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    // 98 -> https://leetcode.com/problems/validate-binary-search-tree/
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high){
        if(node == null){
            return true;
        }

        if(low != null && node.val <= low){
            return false;
        }

        if(high != null && node.val >= high){
            return false;
        }

        boolean leftSubTree = helper(node.left, low, node.val);
        boolean rightSubTree = helper(node.right, node.val, high);

        return leftSubTree && rightSubTree;
    }

    //    108 - > https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0){
            return null;
        }

        return populateSorted(nums, 0, nums.length - 1);
    }

    private TreeNode populateSorted(int[] nums, int i, int i1) {
        if (i < i1) {
            return null;
        }
        int mid = i + (i1 - i)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = populateSorted(nums, i, mid - 1);
        root.right = populateSorted(nums, mid + 1, i1);
        return root;
    }

    //    230 - > https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    public TreeNode helper(TreeNode node, int k){
        if(node == null){
            return null;
        }

        TreeNode left = helper(node.left, k);

        if(left != null){
            return left;
        }
        count++;
        if(count == k){
            return node;
        }

        return helper(node.right, k);
    }

    //    105 -> https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }

        int root = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i] == root){
                index = i;
            }
        }

        TreeNode node = new TreeNode(root);

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index+1, preorder.length), Arrays.copyOfRange(inorder, index+1, inorder.length));
        return node;
    }

//    129 - > https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
    public int sumNumbers(TreeNode root) {
        return helper2(root, 0);
    }
    public int helper2(TreeNode node, int sum){
        if(node == null){
            return 0;
        }

        sum = sum * 10 + node.val;

        if(node.left == null && node.right == null){
            return sum;
        }
        return helper2(node.left, sum) + helper2(node.right, sum);
    }

    // 124 - > https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper3(root);
        return ans;
    }
    public int helper3(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = helper3(node.left);
        int right = helper3(node.right);
        left = Math.max(0, left);
        right = Math.max(0, right);

        int pathSum = left + right + node.val;
        ans = Math.max(ans, pathSum);

        return Math.max(left,  right) + node.val;
    }

    // Pathsum exists in the binary tree
    public int ValidPathSum(TreeNode root, int sum){
        List<Integer> path = new LinkedList<>();
        return helpers(root, sum, path);
    }

    public int helpers(TreeNode node, int sum, List<Integer> path){
        if(node == null){
            return 0;
        }
        path.add(node.val);
        int count = 0;
        int s = 0;

        // how many paths can be extracted
        ListIterator<Integer> itr = path.listIterator(path.size());
        while(itr.hasPrevious()){
            s += itr.previous();

            if(s == sum){
                count++;
            }
        }

        count += helpers(node.left, sum, path) + helpers(node.right, sum, path);

        // Backtrack
        path.remove(path.size() - 1);

        return count;
    }


    // Valid path in the tree
    public boolean validPath(TreeNode root, int[] arr){
        if(root == null){
            return arr.length == 0;
        }
        return helper4(root, arr, 0);
    }

    public boolean helper4(TreeNode node, int[] arr, int index){
        if(node == null){
            return false;
        }
        if(index >= arr.length || node.val != arr[index]){
            return false;
        }
        if(node.left == null && node.right == null && index == arr.length - 1){
            return true;
        }
        return helper4(node.left, arr, index+1) || helper4(node.right, arr, index+1);
    }


    // 112 -> https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    //    297 -> https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                sb.append("null,");
            } else {
                sb.append(node.val).append(",");
                queue.add(node.left);
                queue.add(node.right);
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }

        String[] nodes = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode parent = queue.poll();

            if (!nodes[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(nodes[i]));
                parent.left = left;
                queue.add(left);
            }
            i++;

            if (!nodes[i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(nodes[i]));
                parent.right = right;
                queue.add(right);
            }
            i++;
        }

        return root;
    }


    //    236 -> https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        return left == null ? right : left;
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

        public TreeNode(int val){
            this.val = val;
        }
    }
}
