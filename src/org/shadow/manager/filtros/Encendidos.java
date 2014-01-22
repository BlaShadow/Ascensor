package org.shadow.manager.filtros;

import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Direccion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/21/14
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Encendidos extends Filtro {
    public Encendidos(List<Ascensor> ascensores) {
        super(ascensores);
    }

    @Override
    public List<Ascensor> getAscensorDisponible() {

        List<Ascensor> result = new ArrayList<Ascensor>();

        for(int i=0;i<ascensores.size();i++){
            if(ascensores.get(i).getPisoActual() > 0){
                result.add(ascensores.get(i));
            }
        }

        return result;
    }

    @Override
    public List<Ascensor> getAscensorDisponible(Direccion direccion) {

        List<Ascensor> result = new ArrayList<Ascensor>();

        for(int i=0;i<ascensores.size();i++){
            Ascensor item = ascensores.get(i);

            if(item.getPeticiones() < 20 && item.getDireccion() != direccion){
                result.add(ascensores.get(i));
            }
        }

        return result;
    }
}
