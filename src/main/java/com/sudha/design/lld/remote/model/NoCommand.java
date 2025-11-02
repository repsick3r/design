package com.sudha.design.lld.remote.model;

public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("No receiver is present!");
    }

    @Override
    public void undo() {
        System.out.println("No receiver is present!");
    }
}
