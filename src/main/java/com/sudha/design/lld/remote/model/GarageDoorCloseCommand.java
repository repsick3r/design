package com.sudha.design.lld.remote.model;

public class GarageDoorCloseCommand implements Command{
    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute(){
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
