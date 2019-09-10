package com.qyh.dependencycircle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterPrototypeDependencyCircle {
    public static void main(String[] args) throws Throwable {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dependencycircleprototype.xml");
            System.out.println(ctx.getBean("testA"));
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
