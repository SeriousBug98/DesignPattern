package org.practice.strategy.example1;

public class User {
    public static void main(String[] args) {
        TakeWeaponStrategy takeWeaponStrategy = new TakeWeaponStrategy();

        takeWeaponStrategy.setWeaponBehavior(new Shield());
        takeWeaponStrategy.attack();

        takeWeaponStrategy.setWeaponBehavior(new Sword());
        takeWeaponStrategy.attack();
    }
}
