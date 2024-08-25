package org.practice.strategy.example1;

public class Shield implements WeaponBehavior{
    @Override
    public void offensive() {
        System.out.println("방패로 밀친다");
    }
}
