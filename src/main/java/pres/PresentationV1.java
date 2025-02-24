package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.IMetierImpl;

public class PresentationV1 {
    public static void main(String[] args) {
        IMetierImpl metier = new IMetierImpl();
        DaoImpl d = new DaoImpl();
        metier.setDao(d);
        System.out.println(metier.calcul());

    }
}
