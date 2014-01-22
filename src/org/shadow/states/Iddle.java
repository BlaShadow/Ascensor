package org.shadow.states;


import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Direccion;

public class Iddle extends State{

    public Iddle(Ascensor ascensor) {
        super(ascensor);
    }

    @Override
    public void execute() {
        this.timer = this.timer + 1;
        System.out.println("Iddle");

        if(this.timer > 60){

            this.ascensor.setPisoActual(0);
            this.ascensor.setDireccion(Direccion.DETENIDO);

            System.out.println("Deberia de ir al primer piso");
        }
    }
}
