package org.leetcode.items.nodes;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.nodes.ListNode;
import org.nodes.NodeUtils;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 20:09
 * @Description: NodeUtilsTest
 * @Version 1.0.0
 */
public class NodeUtilsTest {

    @Test
    public void testBuildNode(){
        ListNode listNode = NodeUtils.buildNode(Lists.newArrayList(1, 2, 3, 4, 5));
        Assert.assertEquals(listNode.toString(),"1,2,3,4,5");
    }
}
