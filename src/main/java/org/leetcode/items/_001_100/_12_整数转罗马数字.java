package org.leetcode.items._001_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/5/30 10:43
 * @Description: _12_整数转罗马数字
 * @Version 1.0.0
 */
public class _12_整数转罗马数字 {

    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(0,"");
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");
    }
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        int c = 10;
        while (num * 10 >= c){
            int t = num % c;
            res.insert(0, map.get(t));
            num -= t;
            c *= 10;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(300));
    }
}
