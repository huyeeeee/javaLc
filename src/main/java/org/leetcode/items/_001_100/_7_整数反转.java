package org.leetcode.items._001_100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/28 23:29
 * @Description: _7_整数反转
 * @Version 1.0.0
 */
public class _7_整数反转 {
    public int reverse(int x) {
        Long l = Long.valueOf(x);
        Long l1 = Math.abs(l);
        String s1 = new StringBuilder(l1.toString()).reverse().toString();
        int notZeroIndex = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '0'){
                notZeroIndex += 1;
            }else {
                break;
            }
        }
        s1 = s1.substring(notZeroIndex);
        if (s1.length() == 0) return 0;
        Long l2 = Long.parseLong(s1);
        if (!l1.equals(l)) l2 = -l2;
        if (l2 > Integer.MAX_VALUE || l2 < Integer.MIN_VALUE) return 0;
        return l2.intValue();
    }

    String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations1(String digits) {
        List<String> res = new ArrayList<>();
        if ("".equals(digits)){
            return res;
        }
        char[] chars = digits.toCharArray();
        boolean[] used = new boolean[chars.length];
        StringBuilder path = new StringBuilder();
        dfs(chars,res,used,0,path,letters);
        return res;
    }

    private void dfs(char[] chars, List<String> res, boolean[] used,int depth, StringBuilder path,String[] letters) {
        if (chars.length == depth){
            res.add(path.toString());
            return;
        }
        for (int i = depth; i < chars.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            String letter = letters[(chars[i] - '2')];
            for (int j = 0; j < letter.length(); j++) {

                path.append(letter.charAt(j));
                dfs(chars,res,used,depth+1,path,letters);
                path.deleteCharAt(path.length() - 1);
            }
            used[i] = false;
        }
    }
}
