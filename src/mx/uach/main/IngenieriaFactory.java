package mx.uach.main;

import mx.uach.main.conta.Contabilidad;
import mx.uach.main.enums.CarrerasFca;
import mx.uach.main.enums.CarrerasIng;
import mx.uach.main.ing.Ingenieria;
import mx.uach.main.ing.Software;

/**
 * Created by iza19 on 10/24/16.
 */
public class IngenieriaFactory extends AbstractFactory {
    @Override
    Ingenieria getCarrera(CarrerasIng carrera) {
        switch (carrera){
            case SOFTWARE:
                return new Software();
            default:
                return null;
        }
    }

    @Override
    Contabilidad getCarrera(CarrerasFca carrera) {
        return null;
    }
}
