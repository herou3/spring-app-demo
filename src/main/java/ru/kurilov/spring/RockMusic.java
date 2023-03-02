package ru.kurilov.spring;

/**
 * @author Kurilov Pavel
 * Date: 02.03.2023
 */
public class RockMusic implements Music {
  @Override
  public String getSong() {
    return "Wind cries Mary";
  }
}
