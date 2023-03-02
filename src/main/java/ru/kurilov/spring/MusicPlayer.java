package ru.kurilov.spring;

/**
 * @author Kurilov Pavel
 * Date: 02.03.2023
 */
public class MusicPlayer {
  private Music music;

  // IoC
  public MusicPlayer(Music music) {
    this.music = music;
  }

  public void playMusic() {
    System.out.println("Playing " + music.getSong());
  }
}
