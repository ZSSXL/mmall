package com.mmall.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * 防止精度丢失测试
 */
public class BigDecimalTest {
    @Test
    public void test1(){
        // 以下为丢失精度测试
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.15*100);
        System.out.println(123.3/100);
    }

    @Test
    public void test2(){
        // 使用double类型的构造器还是会丢失精度
        BigDecimal b1 = new BigDecimal(0.05);
        BigDecimal b2 = new BigDecimal(0.01);
        System.out.println(b1.add(b2));
    }

    @Test
    public void test3(){
        // 使用String类型的构造器不会丢失精度，所以在商业计算中一定要用bigDecimal的String构造器
        BigDecimal b1 = new BigDecimal("0.05");
        BigDecimal b2 = new BigDecimal("0.01");
        System.out.println(b1.add(b2));
    }

}
