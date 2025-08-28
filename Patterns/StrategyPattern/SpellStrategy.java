package StrategyPattern;

public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You cast a powerful spell to subdue the dragon!");
    }
}
