package metier;

import dao.IDao;

public class IMetierImpl implements IMetier {
    IDao dao;

    public IMetierImpl() {
    }

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res=t*23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
