package com.fc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexTypeTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");

        applicationContext.getBean("complex");
    }
}
