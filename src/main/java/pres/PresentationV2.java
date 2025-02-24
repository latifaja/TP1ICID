package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("config.txt"));
            //INSTACIATION DYNAMIQUE
            String daoClassname = sc.nextLine();
            //System.out.println(daoClassName);
            Class cDao = Class.forName(daoClassname);
            IDao dao =(IDao)cDao.getConstructor().newInstance();
            System.out.println(dao.getData());

            String metierClassname = sc.nextLine();
            Class cMetier = Class.forName(metierClassname);
           // IMetier metier =(IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);
            IMetier metier =(IMetier)cMetier.getConstructor().newInstance();
            Method setDao=cMetier.getMethod("setDao", IDao.class);
            setDao.invoke(metier,dao);
            System.out.println(metier.calcul());







        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
