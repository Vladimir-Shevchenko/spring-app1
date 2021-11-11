package com.shevchenko.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    @Autowired
//    @Qualifier("rockMusic")
    Music music;
    Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music, @Qualifier("rockMusic") Music music2) {
        this.music = music;
        this.music2 = music2;
    }

    //    public String name;
//    public int volume;
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//

    //IoC


//    @Autowired
//    public MusicPlayer(ClassicalMusic music) {
//        this.music = music;
//    }
//    public MusicPlayer() {  }

   // public void setMusic(Music music) {
//        this.music = music;
//    }


    public String playMusic() {
        return "Playing "+music.getSong()+"  and  "+music2.getSong();
    }
}
