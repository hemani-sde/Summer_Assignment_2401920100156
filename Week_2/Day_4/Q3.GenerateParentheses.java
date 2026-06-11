import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> ans = new ArrayList<>();

    private void solve(int open, int close, String curr, int n) {
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        if (open < n) {
            solve(open + 1, close, curr + "(", n);
        }

        if (close < open) {
            solve(open, close + 1, curr + ")", n);
        }
    }

    public List<String> generateParenthesis(int n) {
        solve(0, 0, "", n);
        return ans;
    }
}
