package org.shadow.states;

import org.shadow.entidad.Ascensor;


public abstract class State {

    protected int timer;
    protected Ascensor ascensor;

    public State(Ascensor ascensor){
        this.ascensor = ascensor;
    }

    public abstract void execute();
}
