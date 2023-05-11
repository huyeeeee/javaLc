package org.leetcode.items._001_100;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/11 21:00
 * @Description: _14_最长公共前缀
 * @Version 1.0.0
 */
public class _14_最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        int minLen = Integer.MAX_VALUE;
        String preFix = "";
        for (String str : strs) {
            if (minLen > str.length()){
                minLen = str.length();
                preFix = str;
            }
        }
        int c = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < minLen; i++) {
            int count = 0;
            char c1 = preFix.charAt(c);
            for (String str : strs) {
                if (c1 == str.charAt(i)) count += 1;
            }
            if (count == l){
                builder.append(c1);
                c += 1;
            }
            else return builder.toString();
        }
        return builder.toString();
    }

}
