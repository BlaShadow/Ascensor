package org.shadow.entidad.sorts;

import org.shadow.entidad.Command;
import org.shadow.entidad.TipoPeticion;

import java.util.Comparator;

public class SortCommand implements Comparator<Command> {

    @Override
    public int compare(Command x1, Command x2) {
        if(x1.getTipo() == TipoPeticion.EMERGENCIA || x2.getTipo() == TipoPeticion.EMERGENCIA){
            System.out.println("*******************************************************");
            System.out.println(x1.getTipo().ordinal() - x2.getTipo().ordinal());
            System.out.println("*******************************************************");
            return -10000;
        }

        return (int)(x1.getPisoDestino() - x2.getPisoDestino());
    }

}
