package com.sudha.design.lld.remote;

import com.sudha.design.lld.Constants;
import com.sudha.design.lld.remote.model.*;

import java.rmi.Remote;

public class Main {
    static void main() {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.pressButton();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(door);
        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.pressButton();

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.println(Constants.marker);
        remote.pressButton(0, "On");
        remote.pressButton(1, "Off");
        remote.pressUndo();
        remote.pressButton(0, "Off");
        remote.pressButton(1, "On");
        remote.pressUndo();
        remote.pressButton(2, "On");
        remote.pressButton(2, "Off");
        remote.pressUndo();

        System.out.println(Constants.marker);
        Command[] commands = {lightOnCommand, garageDoorCloseCommand};
        MacroCommand command = new MacroCommand(commands);
        remote.setCommand(2, command, new NoCommand());

        remote.pressButton(2, "On");
        remote.pressUndo();
    }
}
