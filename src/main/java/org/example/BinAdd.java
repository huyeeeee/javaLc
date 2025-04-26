package org.example;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给出基数为 -2 的两个数 arr1 和 arr2，返回两数相加的结果。数字以 数组形式 给出：数组由若干 0 和 1 组成，按最高有效位到最低有效位的顺序排列。例如，arr = [1,1,0,1] 表示数字 (-2)^3 + (-2)^2 + (-2)^0 = -3。
 * 返回相同表示形式的 arr1 和 arr2 相加的结果。
 * 示例 1：
 * 输入：arr1 = [1,0], arr2 = [1,1,1]
 * 输出：[1]
 * 解释：arr1 表示 -2，arr2 表示 3，输出表示 1。
 * 示例 2：
 * 输入：arr1 = [1,0], arr2 = [1,0,1,0]
 * 输出：[1,1,0,1,0,0]
 * 备注：
 * 1 <= arr1.length, arr2.length <= 1000
 * 两数的表示形式为：不含前导零、由若干 0 和 1 组成的数组。
 */

/*

0 0 1 0
1 0 1 0
---------
1 1 0 1 0 0


*/
public class BinAdd {

    public static void main(String[] args) {
        System.out.println(binAdd(Lists.newArrayList(0, 0, 1, 0), Lists.newArrayList(1, 0, 1, 0)));
    }

    public static List<Integer> binAdd(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        int length1 = l1.size();
        int length2 = l2.size();
        int add = 0;
        if (length1 >= length2) {
            while (length1 > 0) {
                length1 -= 1;
                length2 -= 1;

                Integer i1 = l1.get(length1);
                int i2 = 0;
                if (length2 >= 0) {
                    i2 = l2.get(length2);
                }
                List<Integer> integers = subAdd(i1, i2, add);
                res.add(0, integers.get(1));
                add = integers.get(0);
            }
        }
        List<Integer> integers = subAdd(0, 0, add);
        integers.addAll(res);
        return integers;
    }

    /*
     1 0 1 == 5
     1 0 1 == 5
 -----
     1 1 1 1 0

 */
    public static List<Integer> subAdd(int i1, int i2, int i3) {
        int sum = i1 + i2 + i3;
        if (sum == -1) {
            return Lists.newArrayList(1, 1);
        } else if (sum == 0) {
            return Lists.newArrayList(0, 0);
        } else if (sum == 1) {
            return Lists.newArrayList(0, 1);
        } else if (sum == 2) {
            return Lists.newArrayList(-1, 0);
        } else if (sum == 3) {
            return Lists.newArrayList(-1, 1);
        }
        return Collections.emptyList();
    }
}
