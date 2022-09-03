/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<Double> averageList = new ArrayList<Double>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null)
            return new ArrayList<Double>();
        else{
            averageOfNodes(new ArrayList<TreeNode>(){
                {
                    add(root);
                }
            });
        }
        return averageList;
        
    }
    
    public void averageOfNodes(List<TreeNode> nodes){
        long sum = 0;
        List<TreeNode> nextLevelNodes = new ArrayList();
        for(TreeNode node : nodes){
            sum += node.val;
            TreeNode left = node.left;
            TreeNode right = node.right;
            if(left != null)
                nextLevelNodes.add(left);
            if(right != null){
                nextLevelNodes.add(right);
            }
        }
        averageList.add(Double.valueOf(sum) / Double.valueOf(nodes.size()));
        if(!nextLevelNodes.isEmpty())
            averageOfNodes(nextLevelNodes);
    }
}