package com.sudha.design.lld.hometheatre.model;

public class MovieFacade {
    private final Amplifier amplifier;
    private final PopcornPopper popper;
    private final Projector projector;

    public MovieFacade(Amplifier amplifier, PopcornPopper popper, Projector projector){
        this.amplifier = amplifier;
        this.popper = popper;
        this.projector = projector;
    }

    public void startMovie(){
        popper.start();
        amplifier.on();
        projector.on();
        popper.pop();
    }

    public void endMovie() {
        popper.stop();
        amplifier.off();
        projector.off();
    }
}
