package com.company.HomeWork.HomeWork_3_3_1;

import com.company.HomeWork.HomeWork_3_3_1.Weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[]{
                new Pistol(), new Rifle(), new RPG(), new Slingshot(), new WaterPistol()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно
        try {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];

            // Огонь!
            weapon.shot();
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }
    }
}