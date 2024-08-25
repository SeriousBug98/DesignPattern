package org.practice.strategy.example1;

public class Sword implements WeaponBehavior{
    @Override
    public void offensive() {
        System.out.println("칼을 휘두르다");
    }
}
