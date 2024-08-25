package org.practice.decorator.weapon;

public abstract class WeaponAccessory extends Weapon {
    Weapon weapon;

    public abstract void aimAndFire();
}
