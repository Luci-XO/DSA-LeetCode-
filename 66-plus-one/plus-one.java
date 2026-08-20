import java.util.Collections;
import java.util.Vector;
class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        Vector<Integer> ans = new Vector<>();
        int carry = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                ans.add(arr[i] + carry);
                carry = 0;
            } else {
                ans.add(0);
                carry = 1;
            }
        }
        if (carry == 1) {
            ans.add(1);
        }
        Collections.reverse(ans);
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
