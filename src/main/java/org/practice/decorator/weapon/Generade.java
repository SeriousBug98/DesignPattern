package org.practice.decorator.weapon;

public class Generade extends WeaponAccessory {

    public Generade(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void aimAndFire() {
        weapon.aimAndFire();
        System.out.println("유탄 발사");
    }
}
