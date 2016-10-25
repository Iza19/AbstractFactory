package mx.uach.main;

import mx.uach.main.conta.Contabilidad;
import mx.uach.main.enums.CarrerasFca;
import mx.uach.main.enums.CarrerasIng;
import mx.uach.main.enums.Facultades;
import mx.uach.main.ing.Ingenieria;

/**
 * Created by iza19 on 10/24/16.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory ingenieriaFactory = FactoryProducer.getFactory(Facultades.INGENIERIA);
        AbstractFactory contaFactory = FactoryProducer.getFactory(Facultades.CONTABILIDAD);
        Ingenieria software = ingenieriaFactory.getCarrera(CarrerasIng.SOFTWARE);
        software.integrar();
        Contabilidad lasca = contaFactory.getCarrera(CarrerasFca.LASCA);
        lasca.balancesGenerales();

    }
}
