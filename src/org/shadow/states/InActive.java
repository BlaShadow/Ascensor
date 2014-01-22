package org.shadow.states;

import org.shadow.entidad.Ascensor;

public class InActive extends State {

    public InActive(Ascensor ascensor) {
        super(ascensor);
    }

    @Override
    public void execute() {
        System.out.println("Apagado");
        this.ascensor.setPisoActual(0);
    }
}
