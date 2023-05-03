package org.leetcode.items._101_200;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @Auther: hujiangping
 * @Date: 2023/5/3 13:59
 * @Description: _146_LRU缓存
 * @Version 1.0.0
 */
public class _146_LRU缓存 {
    LinkedList<Integer> list;
    HashMap<Integer,Integer> map;
    Integer cap = 0;
    public _146_LRU缓存(int capacity) {
        cap = capacity;
        list = new LinkedList<>();
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (map.containsKey(key)){
            list.remove((Integer) key);
            list.add(key);
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)){
            list.remove((Integer)key);
        } else {
            if (list.size() == cap){
                map.remove(list.remove(0));
            }
        }
        list.add(key);
        map.put(key,value);

    }
}
