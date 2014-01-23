package org.shadow.entidad;

import org.shadow.entidad.sorts.SortCommand;
import org.shadow.states.*;

import java.util.*;

public class Ascensor extends Thread {

    private final int INTERVAL = 1000;
    private Direccion direccion = null;
    private PriorityQueue<Command> peticiones = null;
    private org.shadow.states.State estado = null;
    private int pisoActual = 0;
    private SortCommand comparador = new SortCommand();

    public Ascensor(){
        peticiones = new PriorityQueue<Command>(1,comparador);
    }

    public void setEstado(org.shadow.states.State state){
        this.estado = state;
    }

    public org.shadow.states.State getEstado()
    {
        return this.estado;
    }

    public int getPeticiones()
    {
        return this.peticiones.size();
    }

    public void addPerticion(Command peticion){
        System.out.println("Nueva peticion");

        estado = new Active(this);
        peticiones.add(peticion);

        /*
        *
        * TODO sort peticiones on add new command
        *
        * */
    }

    @Override
    public void run(){
         while (true){
             try {
                 sleep(this.INTERVAL);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }

             this.estado.execute();

             if(peticiones.size() >0){
                Command peticion = peticiones.poll();

                 if( (getEstado() instanceof DoorOpen) == false && peticion.getTipo() == TipoPeticion.PUERTAABIERTA){
                     setEstado(new DoorOpen(this));
                 }

                System.out.println(this.getName() + " Ascensor ejecutandoce " + peticiones.size() + " Peticion " + peticion.getDireccion() + " " + peticion.getPisoDestino());

                if(peticiones.size() == 0){
                    estado = new Iddle(this);
                }
             }
         }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Direccion getDireccion(){
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        if(direccion == Direccion.DETENIDO){
            this.estado = new InActive(this);
        }

        this.direccion = direccion;
    }
}
