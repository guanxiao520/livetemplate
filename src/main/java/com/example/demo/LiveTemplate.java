package com.example.demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

/**
 * @author gx_hp
 * @version V1.0
 * @Package com.example.demo
 * @date 2021/5/15 11:17
 */
@SuppressWarnings("all")
public class LiveTemplate {

    public static final String str = "hello world";

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println("str=" + str);
        }

        List<Integer> integers = new ArrayList<>();
        //fori快捷键
        for (int i = 0; i < 4; i++) {
            integers.add(i);
        }

        for (Integer integer : integers) {
            //soutv  v=value打印值快捷键
            System.out.println("integer = " + integer);
        }

        //soutm 可以输出当前调用的方法栈,作为记录日志非常好用 m=method
        System.out.println("LiveTemplate.main");
        // souf f=format 带有字符串格式化的控制台日志
        System.out.printf("");
        //serr 这是error级别的 err=error
        System.err.println("this is bug");
    }

    public void test() {

        Object a = null;
        //ifn 会检查最近的变量进行判空
        if (a == null) {

        }
        //inn  if not null 快速生成not null
        if (a != null) {

        }
    }

    public static Callable<String> getCallableObj() {

        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                ArrayList<String> languages = new ArrayList<>();
                languages.add("Java");
                languages.add("Python");
                languages.add("Go");
                languages.add("JavaScript");
                return languages.get(new Random().nextInt(languages.size()));
            }
        };
        return callable;
    }

    @Test
    @DisplayName("testStuInsert")
    void testStuInsert() {
        Assertions.fail("no passed.");

    }

    @Test
    @DisplayName("testName")
    void testName() {
        Assertions.fail("no passed.");

    }
}