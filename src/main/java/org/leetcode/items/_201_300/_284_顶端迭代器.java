package org.leetcode.items._201_300;

import java.util.Iterator;

public class _284_顶端迭代器 {
    class PeekingIterator implements Iterator<Integer> {
        Iterator<Integer> iterator;
        Integer next;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            next = iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer ret = next;
            next = iterator.hasNext() ? iterator.next() : null; return ret;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }
}
