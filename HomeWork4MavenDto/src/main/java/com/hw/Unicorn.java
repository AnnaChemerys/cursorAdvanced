package com.hw;

public class Unicorn extends Wonderbeasts{

    @Override
    public String getPortionOfCuteness() {
        return "Hey! My name is " + getName() + "and I am " + getClass().getSimpleName() + "!\nI live on the other side of the rainbow and I am the modern symbol of everything cute in this world.\n" +
                "And I want to wish you good luck in the wonderful world of software development where you can create a miracle by yourself and give life to a little pink horse)";
    }
}
