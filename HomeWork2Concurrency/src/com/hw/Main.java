/*
package com.hw;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Water h2o = new Water();
        Hydrogen hydrogen = new Hydrogen();
        Oxygen oxygen = new Oxygen();

    }


    class Water {
        private final Semaphore molecularHydrogen;
        private final Semaphore molecularOxygen;
        private final CyclicBarrier molecularBarrier;

        public Water() {
            molecularHydrogen = new Semaphore(2, true);
            molecularOxygen = new Semaphore(1, true);
            molecularBarrier = new CyclicBarrier(3, () -> {
                molecularHydrogen.release(2);
                molecularOxygen.release(1);
            });
        }

        public void releaseHydrogen(Hydrogen hydrogen) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
                molecularHydrogen.acquire();
                hydrogen.run();
                try {
                    molecularBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                } */
/*finally {
                molecularHydrogen.release();
            }*//*

            }
        }

        public void releaseOxygen(Oxygen oxygen) throws InterruptedException {
            for (int i = 0; i < 10; i++) {
            molecularOxygen.acquire();
            oxygen.run();
            try {
                molecularBarrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            } */
/*finally {
                molecularOxygen.release();
            }*//*

        }
    }
}
}
*/
