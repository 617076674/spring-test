package com.qyh.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        //当遇到自定义标签<user:aaa这样类似于以user开头的元素，就会把这个元素扔给对应的UserBeanDefinitionParser去解析
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
