package com.atguigu.java;

import com.aiguigu.bean.customer;
import sun.security.provider.PolicySpiFile;

import java.util.ArrayList;

/**
 * @author 邱俊豪
 * @create 2022-07-20 0:23
 */
public class Templates {
    private static final customer cust = new customer();
    public static final int num = 1;
    public static final int num2 = 2;
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Templates.main");
        int num=1;
        int num1=2;
        System.out.println("num1 = " + num1);
        System.out.println("num = " + num);
        System.out.println(num);

        for (int i = 0; i < ; i++) {
            System.out.println("i = " + i);
        }
        String[] str = new String[]{"fmifn","win","viciown"};
        for (String s : str) {
            System.out.println("s = " + s);
        }
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            
        }
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
    //生成的模板演示
    public void test(){
        
    }
    //生成的模板
    /**
    *客户id
    */
    private int  id= 1001;
    
    
}
