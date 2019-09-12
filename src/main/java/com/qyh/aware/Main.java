package com.qyh.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("awareTest.xml");
        Test test = (Test) ctx.getBean("test");
        test.testAware();
    }
}
