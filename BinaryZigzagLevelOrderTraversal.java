
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> st = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root!=null)st.add(root);
        int k = 0;
        while(!st.isEmpty()){
            ArrayList<Integer> arr = new ArrayList<>();
            int n = st.size();
            for(int i = 0 ; i<n ; i++){
                TreeNode temp = st.poll();
                if(temp==null)break;
                arr.add(temp.val);
                if(temp.left!=null)st.add(temp.left);
                if(temp.right!=null)st.add(temp.right);
            }
               // REVERSING IF K IS ODD
            if(k%2!=0){
                Collections.reverse(arr);
                ans.add(new ArrayList<>(arr));
            }else ans.add(new ArrayList<>(arr));
            k++;
        }return ans;
    }
}
