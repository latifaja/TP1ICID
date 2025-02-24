package pres;

import ext.DaoImplV2;
import metier.IMetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        //DaoImpl d = new DaoImpl();
        DaoImplV2 d = new DaoImplV2();
        IMetierImpl metier = new IMetierImpl(d);//INJECTION VIA CONSTRUCTEUR

        //metier.setDao(d);//INJECTION VIA SETTER
        System.out.println(metier.calcul());

    }
}
