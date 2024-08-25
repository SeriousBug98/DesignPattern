package org.practice.decorator.weapon;

public class Scoped extends WeaponAccessory{

    public Scoped(Weapon weapon) {
        this.weapon=weapon;
    }

    @Override
    public void aimAndFire() {
        weapon.aimAndFire();
        System.out.println("조준 중..");
    }
}
