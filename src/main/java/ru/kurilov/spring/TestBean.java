package ru.kurilov.spring;

/**
 * @author Kurilov Pavel
 * Date: 01.03.2023
 */
public class TestBean {
  private String name;

  public TestBean(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
