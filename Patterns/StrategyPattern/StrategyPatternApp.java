package StrategyPattern;

public class StrategyPatternApp {
    public static void main(String[] args) {
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        dragonSlayer.changeStrategy(new RangedStrategy());
        dragonSlayer.goToBattle();
    }
}
