package AbstractFactory.impl;

import AbstractFactory.King;

public class ElfKing implements King {
    @Override
    public String getDescription() {
        return "This is the Elf King!";
    }
}
