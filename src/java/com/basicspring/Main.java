package com.basicspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.doQuest();
        context.close();

    }
}
