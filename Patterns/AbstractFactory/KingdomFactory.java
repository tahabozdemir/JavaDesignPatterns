package AbstractFactory;

public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
