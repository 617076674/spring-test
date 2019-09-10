package com.qyh.dependencycircle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorSingletonDependencyCircle {
    public static void main(String[] args) throws Throwable {
        //（1）Spring容器创建"testA"bean，首先去"当前创建bean池"查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器
        //参数"testB"，并将"testA"标识符放到"当前创建bean池"。
        //（2）Spring容器创建"testB"bean，首先去"当前创建bean池"查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器
        //参数"testC"，并将"testB"标识符放到"当前创建bean池"。
        //（3）Spring容器创建"testC"bean，首先去"当前创建bean池"查找是否当前bean正在创建，如果没发现，则继续准备其需要的构造器
        //参数"testA"，并将"testC"标识符放到"当前创建bean池"。
        //（4）到此为止Spring容器要去创建"testA"bean，发现该bean标识符在"当前创建bean池"中，因为表示循环依赖，抛出
        //BeanCurrentlyInCreationException
        try {
            new ClassPathXmlApplicationContext("dependencycircle.xml");
        } catch (Exception e) {
            //因为要在创建testC时抛出
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
