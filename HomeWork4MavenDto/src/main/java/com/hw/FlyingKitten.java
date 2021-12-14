package com.hw;

public class FlyingKitten extends Wonderbeasts{

    @Override
    public String getPortionOfCuteness() {
        return "Hey! My name is " + getName() + " and I am " + getClass().getSimpleName() + "! \nI would like to write code but I have paws so I found my calling to just be myself\n" +
                "But you can!\n" +
                "And I believe in you young Java developer\n" +
                "Kindness to you and murmurmurrr";
    }
}
