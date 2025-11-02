package com.sudha.design.lld.remote.model;

public class MacroCommand implements Command{
    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for(Command command : commands){
            command.execute();
        }
    }

    public void undo() {
        for(Command command : commands){
            command.undo();
        }
    }
}
