package com.example.designpatterns.behavioral.command.dojo.one;

public class Application {

    public static void main(String[] args) {

        ShortcutInvoker shortcutInvoker = new ShortcutInvoker();
        shortcutInvoker.paste();
    }
}
