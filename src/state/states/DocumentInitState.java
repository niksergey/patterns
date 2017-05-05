package state.states;

public class DocumentInitState extends DocumentState {
    private static final DocumentState startSendState = new DocumentStartSendState();

    @Override
    public DocumentState newDocument() {
        System.out.println("Документ инициализирован");
        return startSendState;
    }
}
