package org.leetcode.items._201_300;

import java.util.PriorityQueue;

/**
 * @Author: hujiangping
 * @Date: 2023/6/12 20:35
 * @Description: _295_数据流的中位数
 * @Version 1.0.0
 */
public class _295_数据流的中位数 {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public _295_数据流的中位数() {
        min = new PriorityQueue<>((i1, i2) -> i2 - i1);
        max = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (max.size() != min.size()) {
            min.add(num);
            max.add(min.poll());
        } else {
            max.add(num);
            min.add(max.poll());
        }
    }

    public double findMedian() {
        if (max.size() != min.size()) {
            return min.peek();
        } else {
            return (max.peek() + min.peek()) / 2d;
        }
    }
}
