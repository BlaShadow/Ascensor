package org.shadow.states;

import org.shadow.entidad.Ascensor;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/18/14
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class State {

    private int timer;
    private Ascensor asc;

    public State(Ascensor ascensor){
        this.asc = ascensor;
    }

    public abstract void execute();
}
