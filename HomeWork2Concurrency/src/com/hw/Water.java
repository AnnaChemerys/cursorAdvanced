package com.hw;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Water {

    public static void main(String[] args) throws InterruptedException {

        Water water = new Water();
        Hydrogen hydrogen = new Hydrogen();
        Oxygen oxygen = new Oxygen();


    }


    private final Semaphore molecularHydrogen;
    private final Semaphore molecularOxygen;
    private final CyclicBarrier molecularBarrier;

    public Water() {
        molecularHydrogen = new Semaphore(2, true);
        molecularOxygen = new Semaphore(1, true);
        molecularBarrier = new CyclicBarrier(3);
    }


    public void releaseHydrogen(Hydrogen hydrogen) throws InterruptedException {
        molecularHydrogen.acquire();
        hydrogen.run();
        try {
            molecularBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            molecularHydrogen.release();
        }
    }

    public void releaseOxygen(Oxygen oxygen) throws InterruptedException {
        molecularOxygen.acquire();
        oxygen.run();
        try {
            molecularBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            molecularOxygen.release();
        }
    }
}
