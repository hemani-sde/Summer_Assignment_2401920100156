import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean check(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return ans;
        }

        int[] freqP = new int[26];
        int[] freqS = new int[26];

        for (int i = 0; i < m; i++) {
            freqP[p.charAt(i) - 'a']++;
            freqS[s.charAt(i) - 'a']++;
        }

        if (check(freqP, freqS)) {
            ans.add(0);
        }

        for (int i = m; i < n; i++) {
            freqS[s.charAt(i) - 'a']++;
            freqS[s.charAt(i - m) - 'a']--;

            if (check(freqP, freqS)) {
                ans.add(i - m + 1);
            }
        }

        return ans;
    }
}
