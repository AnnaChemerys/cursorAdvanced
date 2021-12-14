package com.hw;

public class Main {
    public static void main(String[] args) {

        Unicorn unicorn = new Unicorn();
        unicorn.setName("Twilight Sparkle");
        System.out.println(unicorn.getPortionOfCuteness());

        System.out.println("^_^");
        Pegasus pegasus = new Pegasus();
        pegasus.setName("Morgenstern"); //not as a singer, but as the horse of Prince Julian from "The Chronicles of Amber"
        System.out.println(pegasus.getPortionOfCuteness());

        System.out.println("^_^");
        FlyingKitten flyingKitten = new FlyingKitten();
        flyingKitten.setName("Marcus");
        System.out.println(flyingKitten.getPortionOfCuteness());


    }
}
