package AbstractFactory.impl;
import AbstractFactory.Castle;

public class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is the Elf Castle!";
    }
}
