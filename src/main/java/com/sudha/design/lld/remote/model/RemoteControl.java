package com.sudha.design.lld.remote.model;

import com.sudha.design.lld.Constants;

import java.util.Objects;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undo;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        for(int i=0; i<3; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
        undo = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if(slot < 3){
            offCommands[slot] = offCommand;
            onCommands[slot] = onCommand;
        }
    }

    public void pressButton(int slot, String on){
        if(Objects.equals(on, "On")){
            onCommands[slot].execute();
            undo = onCommands[slot];
        }
        else{
            offCommands[slot].execute();
            undo = offCommands[slot];
        }
    }

    public void pressUndo(){
        System.out.println(Constants.marker);
        undo.undo();
    }
}
