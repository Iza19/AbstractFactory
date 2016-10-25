package mx.uach.main;

import mx.uach.main.conta.Contabilidad;
import mx.uach.main.enums.CarrerasFca;
import mx.uach.main.enums.CarrerasIng;
import mx.uach.main.ing.Ingenieria;

/**
 * Created by iza19 on 10/24/16.
 */
public abstract class AbstractFactory {
    abstract Ingenieria getCarrera(CarrerasIng carrera);
    abstract Contabilidad getCarrera(CarrerasFca carrera);
}
