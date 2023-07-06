package com.example.designpatterns.behavioral.command.dojo.one;

public class PasteReceiver {

    public void pasteTextToApp(String text) {
        System.out.println(String.format("Pasting %s from user to app editor.", text));
    }
}
