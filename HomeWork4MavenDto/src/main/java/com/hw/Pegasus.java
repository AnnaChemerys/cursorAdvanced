package com.hw;

public class Pegasus extends Wonderbeasts{

    @Override
    public String getPortionOfCuteness() {
        return "Hey! My name is " + getName() + "and I am " + getClass().getSimpleName() + "!\nMy favorite song is \"I believe I can fly\"\n" +
                "And I believe that you can become a Java developer ^_^";
    }
}
