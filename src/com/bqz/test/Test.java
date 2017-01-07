package com.bqz.test;

import java.util.Comparator;

/**
 * Created by biqiaozheng on 2017/1/7.
 */
public class Test {

    public static void main(String[] args) {
        Comparator<String> comp = (String first, String second) -> Integer.compare(first.length(), second.length());

        System.out.println( comp );



    }
}
