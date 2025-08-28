package AbstractFactory.impl;

import AbstractFactory.Army;
import AbstractFactory.Castle;
import AbstractFactory.King;
import AbstractFactory.Kingdom;

public final class ElfKingdom implements Kingdom {
    private final King king;
    private final Castle castle;
    private final Army army;

    public ElfKingdom(King king, Castle castle, Army army) {
        this.king = king;
        this.castle = castle;
        this.army = army;
    }

    @Override
    public Castle getCastle() {
        return castle;
    }

    @Override
    public King getKing() {
        return king;
    }

    @Override
    public Army getArmy() {
        return army;
    }
}
