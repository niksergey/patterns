package state.states;

public abstract class DocumentState {
    public DocumentState newDocument() throws IllegalStateException {
        throw new IllegalStateException();
    }

    public DocumentState sendInit() throws IllegalStateException {
        throw new IllegalStateException();
    }

    public DocumentState signDocument() throws IllegalStateException {
        throw new IllegalStateException();
    }

    public DocumentState registerDocument() throws IllegalStateException {
        throw new IllegalStateException();
    }

    public DocumentState recallDocument() throws IllegalStateException {
        throw new IllegalStateException();
    }
}
