package ChainOfResponsibility;

public class OrcOfficer implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.println("Orc officer is handling the request: " + request);
    }

    @Override
    public String name() {
        return "Orc Officer";
    }
}
