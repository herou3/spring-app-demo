package ru.kurilov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kurilov Pavel
 * Date: 01.03.2023
 */
public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        "applicationContext.xml"
    );
    System.out.println(context.getBean("testBean", TestBean.class).getName());

    context.close();
  }
}
