package org.leetcode.items;

/**
 * @Author: hujiangping
 * @Date: 2023/7/17 14:36
 * @Description: 单例模式
 * @Version 1.0.0
 */
public class 单例模式 {
}

/**
 * 懒汉模式
 */
class Single1{
    private static Single1 single1 = new Single1();

    private Single1(){}
    public static Single1 getSingle(){
        return single1;
    }
}
/**
 * 饿汉模式
 */
class  Single2{
    private static Single2 s2;

    private Single2(){}

    public static Single2 getInstance(){
        if (s2 == null) s2 = new Single2();
        return s2;
    }
}
/**
 * 双重锁校验饿汉模式
 */
class S3{
    private volatile static S3 s3;

    private S3(){
    }

    public static S3 getInstance(){
        if (s3 == null){
            synchronized (S3.class){
                if (s3 == null) s3 = new S3();

            }
        }
        return s3;
    }
}