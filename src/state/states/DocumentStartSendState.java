package state.states;

public class DocumentStartSendState extends DocumentState {
    @Override
    public DocumentState sendInit() {
        System.out.println("init send document");
        return null;
    }
}

