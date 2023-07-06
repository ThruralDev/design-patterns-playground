package com.example.designpatterns.behavioral.command.dojo.one;

public class ShortcutInvoker {

    PasteCommand command = new PasteCommand("wubbaluppadupdup!");


    public ShortcutInvoker() {
        PasteReceiver pasteReceiver = new PasteReceiver();
        command.initReceiver(pasteReceiver);
    }

    public void changeCommand(PasteCommand pasteCommand){
        this.command = pasteCommand;
    }

    public void paste() {
        command.execute();
    }
}
