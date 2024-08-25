package org.practice.decorator.weapon;

public class Buttstock extends WeaponAccessory{

    public Buttstock(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void aimAndFire() {
        weapon.aimAndFire();
        System.out.println("견착 완료.");
    }
}
