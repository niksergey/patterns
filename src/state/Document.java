package state;

import state.states.DocumentInitState;
import state.states.DocumentState;

public class Document {
    private DocumentState documentState;

    public Document() {
        this.documentState = new DocumentInitState();
    }

    void newDocument() {
        documentState = documentState.newDocument();
    }

    void sendInit() {
        documentState = documentState.sendInit();
    }
    void signDocument() {
        documentState = documentState.signDocument();
    }
    void registerDocument() {
        documentState = documentState.registerDocument();
    }
    void recallDocument() {
        documentState = documentState.recallDocument();
    }
}
