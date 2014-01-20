package org.shadow.entidad;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/18/14
 * Time: 4:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Ascensor extends Thread {

    /*
    *
    * TODO Sorted Queue
    *
    * */
    private Queue<Command> peticiones = null;
    private State estado = null;
    private int pisoActual = 0;

    public Ascensor(){
        peticiones = new LinkedList<Command>();
    }

    public void setState(State state){
        this.estado = state;
    }

    public void addPerticion(Command peticion){
        peticiones.add(peticion);
    }

    @Override
    public void run(){

    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }
}
