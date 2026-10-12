package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierIMP implements IMetier {

    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        return dao.getvalue() * 7;
    }

    public void setDao(IDao dao) {   // conservé pour compatibilité
        this.dao = dao;
    }
}