package mx.uach.main;

import mx.uach.main.enums.Facultades;

/**
 * Created by iza19 on 10/24/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(Facultades facultades){
        switch (facultades){
            case INGENIERIA:
                return new IngenieriaFactory();
            case CONTABILIDAD:
                return new ContabilidadFactory();
            default:
                return null;
        }
    }
}
