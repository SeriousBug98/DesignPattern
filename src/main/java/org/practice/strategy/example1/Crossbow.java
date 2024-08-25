package org.practice.strategy.example1;

public class Crossbow implements WeaponBehavior{
    @Override
    public void offensive() {
        System.out.println("석궁을 발사하다");
    }
}
