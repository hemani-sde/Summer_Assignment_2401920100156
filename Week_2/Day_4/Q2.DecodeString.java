import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> words = new Stack<>();

        String curr = "";
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                nums.push(num);
                words.push(curr);

                num = 0;
                curr = "";
            } 
            else if (ch == ']') {
                int times = nums.pop();
                String prev = words.pop();

                StringBuilder temp = new StringBuilder();

                for (int i = 0; i < times; i++) {
                    temp.append(curr);
                }

                curr = prev + temp.toString();
            } 
            else {
                curr += ch;
            }
        }

        return curr;
    }
}
