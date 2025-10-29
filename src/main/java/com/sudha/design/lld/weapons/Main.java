package com.sudha.design.lld.weapons;

import com.sudha.design.lld.weapons.model.character.*;
import com.sudha.design.lld.weapons.model.character.Character;
import com.sudha.design.lld.weapons.model.weapon.AxeBehaviour;

public class Main {
    static void main() {
        Character king = new King();
        king.fight();
        king.setWeaponBehaviour(new AxeBehaviour());
        king.fight();
        king = new Queen();
        king.fight();
        Knight knight = new Knight();
        Troll troll = new Troll();
        knight.fight();
        troll.fight();
    }
}
