package com.company;

import org.shadow.entidad.Command;
import org.shadow.entidad.Direccion;
import org.shadow.entidad.TipoPeticion;
import org.shadow.entidad.sorts.SortCommand;
import org.shadow.manager.SistemaManager;
import org.shadow.manager.factory.ManagerFactory;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SistemaManager manager = ManagerFactory.getManager();
        Random rand = new Random();

        for (int loop=0;loop<2;loop++){
            /*for(int i=0;i<100;i++){
                int pisoOrigen = 0;
                int pisoDestino = rand.nextInt(100);
                Direccion direccion = i % 2 == 0?Direccion.ARRIBA:Direccion.ABAJO;

                Command peticion = new Command(pisoOrigen,pisoDestino,direccion);

                manager.peticion(peticion);
            }
            */

            for(int i=0;i<10;i++){
                int pisoOrigen = 0;
                int pisoDestino = rand.nextInt(100);
                Direccion direccion = Direccion.DETENIDO;

                Command peticion = new Command(pisoOrigen,pisoDestino,direccion);

                if(i == 5)
                    peticion.setTipo(TipoPeticion.EMERGENCIA);

                manager.peticion(peticion);
            }

            /*
            for(int i=0;i<100;i++){
                int pisoOrigen = 0;
                int pisoDestino = rand.nextInt(100);
                Direccion direccion = Direccion.DETENIDO;

                Command peticion = new Command(pisoOrigen,pisoDestino,direccion);
                peticion.setTipo(TipoPeticion.PUERTAABIERTA);

                manager.peticion(peticion);
            }
            */
        }

        //Hayao Miyazaki


//        PriorityQueue<Command> collection = new PriorityQueue<Command>(10,new SortCommand());
//        Random rand = new Random();
//
//        for (int i=0;i<10;i++){
//            int pisoOrigen = rand.nextInt(100);
//            int pisoDestino = rand.nextInt(100);
//            Direccion direccion = i % 2 == 0?Direccion.ARRIBA:Direccion.ABAJO;
//
//            collection.add(new Command(pisoOrigen,pisoDestino,direccion));
//        }
//
//        while(true){
//            Command item = collection.poll();
//
//            if(item == null)break;
//
//            System.out.println("Piso " + item.getPisoDestino());
//        }
    }
}
