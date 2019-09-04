package com.qyh.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("factoryBeanTest.xml");
//        Car car = (Car) bf.getBean("car");
//        System.out.println(car.getBrand() + "," + car.getMaxSpeed() + "," + car.getPrice());
        CarFactoryBean carFactoryBean = (CarFactoryBean) bf.getBean("&car");
        System.out.println(carFactoryBean.getCarInfo());
    }
}
