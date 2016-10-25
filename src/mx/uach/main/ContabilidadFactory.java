package mx.uach.main;

import mx.uach.main.conta.Contabilidad;
import mx.uach.main.conta.Lasca;
import mx.uach.main.enums.CarrerasFca;
import mx.uach.main.enums.CarrerasIng;
import mx.uach.main.ing.Ingenieria;

/**
 * Created by iza19 on 10/24/16.
 */
public class ContabilidadFactory extends AbstractFactory {
    @Override
    Ingenieria getCarrera(CarrerasIng carrera) {
        return null;
    }

    @Override
    Contabilidad getCarrera(CarrerasFca carrera) {
        switch (carrera){
            case LASCA:
                return new Lasca();
            default:
                return null;
        }
    }
}
