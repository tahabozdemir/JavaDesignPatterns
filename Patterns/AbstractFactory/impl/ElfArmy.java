package AbstractFactory.impl;

import AbstractFactory.Army;

public class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return "This is the Elf Army!";
    }
}
