package com.qyh.basic;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class LoadFile {
    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("beanFactoryTest.xml");
        InputStream inputStream = resource.getInputStream();
    }
}
