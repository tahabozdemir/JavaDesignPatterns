package StrategyPattern;

public class RangedStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("You shoot the dragon with a precise arrow!");
    }
}