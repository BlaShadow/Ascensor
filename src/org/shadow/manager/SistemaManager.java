package org.shadow.manager;

import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Command;
import org.shadow.entidad.Direccion;
import org.shadow.entidad.factory.AscensorFactory;
import org.shadow.manager.filtros.Encendidos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaManager{

    private List<Ascensor> ascensores = null;
    private final int PISOS = 4;
    private final int NUMEROSASCENSORES = 4;

    public SistemaManager(){
        ascensores = new ArrayList<Ascensor>();

        for(int i=0;i< NUMEROSASCENSORES;i++ ){
            ascensores.add(AscensorFactory.getAscensor());
        }

        initAscensores();
    }

    public void initAscensores(){
        for(int i=0;i<ascensores.size();i++){
             ascensores.get(i).start();
        }
    }

    public void peticion(Command comando) {

        System.out.println("Hola mundo comando");

        Ascensor ascensor = this.getAscensor(comando.getDireccion());

        if(ascensor == null){
            System.out.println("No hay Ascxesires disponibles :/.");
            return;
        }

        System.out.println("Peticion hecha " + ascensor.getName());
        ascensor.addPerticion(comando);
    }

    public Ascensor getAscensor(Direccion direccion){
        Encendidos filtro = new Encendidos(this.ascensores);

        List<Ascensor> result = filtro.getAscensorDisponible();

        if(result != null && result.size() > 0){
            System.out.println("Retorno dummy 1");
            return result.get(0);
        }

        result = filtro.getAscensorDisponible(direccion);

        if(result != null && result.size() > 0){
            System.out.println("Retorno dummy 2");
            return result.get(0);
        }

        System.out.println("Retorno dummy 3");
        System.out.println( "Tamanio " + ascensores.size());

        return ascensores.get(0);
    }
}
