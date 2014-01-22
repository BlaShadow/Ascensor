package org.shadow.states;

import org.shadow.entidad.Ascensor;

public class Active extends State{

    public Active(Ascensor ascensor) {
        super(ascensor);
    }

    @Override
    public void execute() {
        System.out.println("Running");
    }
}
