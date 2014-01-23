package org.shadow.states;

import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Direccion;

public class DoorOpen extends State{

    public DoorOpen(Ascensor asc){
        super(asc);
    }

    @Override
    public void execute() {
        this.timer = this.timer + 1;

        if(this.timer > 60){
            System.out.println("Cerrado de las puertas forzado");
        }
    }
}
