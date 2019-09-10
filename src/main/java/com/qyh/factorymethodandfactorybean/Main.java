package com.qyh.factorymethodandfactorybean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("factorymethodandfactorybean.xml"));
        Car car1 = (Car) bf.getBean("car1");
        Car car2 = (Car) bf.getBean("car2");
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
    }
}
