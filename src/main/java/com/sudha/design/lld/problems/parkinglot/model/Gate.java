package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.GateType;

public abstract class Gate {
    private final String id;

    protected Gate(String id) {
        this.id = id;
    }

    public abstract GateType getType();
}

