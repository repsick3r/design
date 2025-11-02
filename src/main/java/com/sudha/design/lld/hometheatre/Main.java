package com.sudha.design.lld.hometheatre;

import com.sudha.design.lld.Constants;
import com.sudha.design.lld.hometheatre.model.Amplifier;
import com.sudha.design.lld.hometheatre.model.MovieFacade;
import com.sudha.design.lld.hometheatre.model.PopcornPopper;
import com.sudha.design.lld.hometheatre.model.Projector;

public class Main {
    static void main() {
        Amplifier amplifier = new Amplifier();
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector();
        MovieFacade facade = new MovieFacade(amplifier, popper, projector);
        facade.startMovie();
        System.out.println(Constants.marker);
        facade.endMovie();
    }
}
