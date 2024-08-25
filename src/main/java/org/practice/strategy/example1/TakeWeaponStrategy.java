package org.practice.strategy.example1;

public class TakeWeaponStrategy {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void attack() {
        weaponBehavior.offensive();
    }
}
