package com.example.designpatterns.behavioral.command.example;

public abstract class Command {

    private String app;
    private String editor;
    private String backup;

    public Command(String app, String editor) {

        this.app = app;
        this.editor = editor;
    }


}
