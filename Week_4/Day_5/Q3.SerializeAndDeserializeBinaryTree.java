class Codec {

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private TreeNode deserializeHelper(String[] data, int[] index) {
        if (index[0] >= data.length) {
            return null;
        }

        if (data[index[0]].equals("N")) {
            index[0]++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(data[index[0]]));
        index[0]++;

        root.left = deserializeHelper(data, index);
        root.right = deserializeHelper(data, index);

        return root;
    }

    
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] index = {0};
        return deserializeHelper(values, index);
    }
}
