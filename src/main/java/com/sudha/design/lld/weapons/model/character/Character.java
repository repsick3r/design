package com.sudha.design.lld.weapons.model.character;

import com.sudha.design.lld.weapons.model.weapon.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    String character;

    public Character(WeaponBehaviour weaponBehaviour, String character) {
        this.weaponBehaviour = weaponBehaviour;
        this.character = character;
    }

    public void fight() {
        System.out.println(character + " " + weaponBehaviour.useWeapon());
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
