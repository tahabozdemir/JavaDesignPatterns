package ChainOfResponsibility;


import java.util.Objects;

public class Request {
    private final RequestType requestType;
    private final String description;
    private boolean handled;

    public Request(RequestType requestType, String description) {
        this.requestType = Objects.requireNonNull(requestType);
        this.description = Objects.requireNonNull(description);
    }

    public void markHandled() {
        this.handled = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getDescription() {
        return description;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return getDescription();
    }
}

