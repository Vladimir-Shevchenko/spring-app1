package com.shevchenko.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements  Music{
    @Override
    public String getSong() {
        return "Wind criesMary";
    }
}

