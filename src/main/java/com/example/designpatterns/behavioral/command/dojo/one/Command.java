package com.example.designpatterns.behavioral.command.dojo.one;

public abstract class Command {

    private String text;

    public Command(String text) {

        this.text = text;
    }

    abstract void execute();
}
