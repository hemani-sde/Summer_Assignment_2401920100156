import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            int idx = -1;

            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    idx = j;
                    break;
                }
            }

            int nextGreater = -1;

            for (int j = idx + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            ans.add(nextGreater);
        }

        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}
