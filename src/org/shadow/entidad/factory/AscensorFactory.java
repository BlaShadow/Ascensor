package org.shadow.entidad.factory;

import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Direccion;
import org.shadow.states.InActive;
import org.shadow.states.State;

public class AscensorFactory {
    public static Ascensor getAscensor(){

        Ascensor item = new Ascensor();

        State estado = new InActive(item);

        item.setDireccion(Direccion.DETENIDO);
        item.setPisoActual(0);
        item.setEstado(estado);

        return item;
    }
}
