package com.shevchenko.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

       // ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
       // System.out.println(classicalMusic.getSong());
        //  TestBean testBean  =   context.getBean("testBean", TestBean.class);
//        Music music =   context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 =   context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
      //  musicPlayer2.playMusic();
//
//        System.out.println(musicPlayer==musicPlayer2);
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer2);
//
//        musicPlayer.setVolume(11);
        System.out.println(musicPlayer.getName());
       System.out.println(musicPlayer.getVolume());

       ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
       ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic2==classicalMusic);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        context.close();
    }
}
