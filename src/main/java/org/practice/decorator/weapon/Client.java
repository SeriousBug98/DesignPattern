package org.practice.decorator.weapon;

public class Client {
    public static void main(String[] args) {
        Weapon weapon = new Rifle();
        weapon = new Buttstock(weapon);
        weapon = new Generade(weapon);
        weapon = new Scoped(weapon);

        weapon.aimAndFire();
    }
}
