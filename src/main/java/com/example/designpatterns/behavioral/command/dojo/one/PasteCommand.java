package com.example.designpatterns.behavioral.command.dojo.one;

public class PasteCommand extends Command {

    private PasteReceiver pasteReceiver;
    private String text;

    public PasteCommand(String text) {
        super(text);
        this.text = text;
    }

    public void initReceiver(PasteReceiver pasteReceiver) {

        this.pasteReceiver = pasteReceiver;
    }

    @Override
    void execute() {
        pasteReceiver.pasteTextToApp(text);
    }
}
