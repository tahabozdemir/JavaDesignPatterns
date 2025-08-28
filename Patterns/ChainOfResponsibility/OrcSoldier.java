package ChainOfResponsibility;

public class OrcSoldier implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.RAID_VILLAGE;
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println("Orc soldier is handling the request: " + request);
    }

    @Override
    public String name() {
        return "Orc Soldier";
    }
}
