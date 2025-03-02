package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class IMetierImpl implements IMetier {

    private IDao dao;

    //public IMetierImpl() {
    //}

    public IMetierImpl(@Qualifier("dao2") IDao dao) {
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
