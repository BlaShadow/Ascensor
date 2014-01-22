package org.shadow.entidad;

public class Command {

    private int pisoOrigen;
    private int pisoDestino;
    private Direccion direccion;

    public Command(int pisoOrigen,int pisoDestino,Direccion direccion){
        this.direccion = direccion;
        this.pisoOrigen = pisoOrigen;
        this.pisoDestino = pisoDestino;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }
}
