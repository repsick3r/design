package com.sudha.design.lld.remote.model;

public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void pressButton(){
        slot.execute();
    }
}
