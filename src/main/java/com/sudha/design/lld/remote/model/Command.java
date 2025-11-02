package com.sudha.design.lld.remote.model;

public interface Command {
    void execute();
    void undo();
}
