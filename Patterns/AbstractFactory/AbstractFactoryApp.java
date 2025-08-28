package AbstractFactory;

import AbstractFactory.impl.ElfKingdom;
import ChainOfResponsibility.OrcKing;
import ChainOfResponsibility.Request;
import ChainOfResponsibility.RequestType;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        createKingdom(FactoryMaker.KingdomType.ELF);
        System.out.println("-------------------------------------------------");

    }

    private static void createKingdom(FactoryMaker.KingdomType type) {
        KingdomFactory factory = FactoryMaker.makeFactory(type);
        King king = factory.createKing();
        Castle castle = factory.createCastle();
        Army army = factory.createArmy();

        Kingdom kingdom = new ElfKingdom(king, castle, army);
        System.out.println(kingdom.getArmy().getDescription());
        System.out.println(kingdom.getCastle().getDescription());
        System.out.println(kingdom.getKing().getDescription());
    }
}
