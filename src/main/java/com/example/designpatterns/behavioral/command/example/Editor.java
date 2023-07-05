package com.example.designpatterns.behavioral.command.example;

public class Editor {

    public String text;

    public void getSelection() {
        System.out.println(text);
    }

    public void deleteSelection() {
        this.text = "";
    }

    public void replaceSelection(String text) {

        this.text = text;
    }
}
