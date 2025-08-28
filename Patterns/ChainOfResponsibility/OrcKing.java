package ChainOfResponsibility;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrcKing {
    private List<RequestHandler> handlers;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new OrcCommander(),
                new OrcOfficer(),
                new OrcSoldier());
    }

    public void makeRequest(Request request) {
        handlers
                .stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(request))
                .findFirst()
                .ifPresent(handler -> handler.handle(request));
    }
}
