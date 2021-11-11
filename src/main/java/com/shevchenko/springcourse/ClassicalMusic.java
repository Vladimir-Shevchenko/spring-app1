package com.shevchenko.springcourse;

import javax.annotation.PostConstruct;


//@Component
//@Scope("prototype")
public class ClassicalMusic implements  Music {

  //  private ClassicalMusic() { }

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
       System.out.println("Initialization...");
   }

   //@PreDestroy
   public void doMyDestroy(){
       System.out.println("Destruction...");
   }


    public String getSong(){
        return  "Hungary Rapsody";
    }
}
