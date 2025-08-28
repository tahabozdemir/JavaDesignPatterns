package ChainOfResponsibility;

import StrategyPattern.DragonSlayer;
import StrategyPattern.MeleeStrategy;
import StrategyPattern.RangedStrategy;
import StrategyPattern.SpellStrategy;

public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "Defend the castle!"));
        king.makeRequest(new Request(RequestType.RAID_VILLAGE, "Raid the village!"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "Collect the taxes!"));
    }
}
