package org.leetcode.items._201_300;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class _227_基本计算器II {
    public int calculate(String s) {
        Deque<String> stack = new ArrayDeque<>();
        s = s.replace(" ","");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if ('+' == s.charAt(i)
                    || '-' == s.charAt(i)
                    || '/' == s.charAt(i)
                    || '*' == s.charAt(i)){
                list.add(String.valueOf(s.charAt(i)));
            }else {
                int count = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))){
                    count *= 10;
                    count += (s.charAt(i) - '0');
                    i+=1;
                }
                i-=1;
                list.add(String.valueOf(count));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            if (Character.isDigit(s1.charAt(0))){
                stack.addLast(s1);
            }else if ('-' == s1.charAt(0) || '+' == s1.charAt(0)){
                stack.addLast(s1);
            }else if ('*' == s1.charAt(0)){
                stack.addLast(String.valueOf(Integer.parseInt(stack.pollLast()) * Integer.parseInt(list.get(++i))));
            }else {
                stack.addLast(String.valueOf(Integer.parseInt(stack.pollLast()) / Integer.parseInt(list.get(++i))));
            }
        }

        while (stack.size() > 1){
            String s1 = stack.pollFirst();
            String s2 = stack.pollFirst();
            String s3 = stack.pollFirst();
            if ("-".equals(s2))
                stack.addFirst(String.valueOf(Integer.parseInt(s1) - Integer.parseInt(s3)));
            if ("+".equals(s2))
                stack.addFirst(String.valueOf(Integer.parseInt(s3) + Integer.parseInt(s1)));
        }
        return Integer.parseInt(stack.pop());
    }
}
