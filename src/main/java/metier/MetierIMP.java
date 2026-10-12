package metier;
import dao.IDao;
public class MetierIMP implements IMetier{
    private IDao dao;
    @Override
    public double calcul(){
        double val=dao.getvalue();
        return 7*val;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
