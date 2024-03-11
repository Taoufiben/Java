package metier;

import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier{
    @Autowired
    @Qualifier("s")
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        double data=dao.getData();
        double result=data*2; 
        return result;
    }

    /**
     * Pour permettre d'injecter ou donner a la variable dao
     * un objet d'une classe DaoImp qui implemente l'interface IDao
     * @param dao
     */
    public void setData(IDao dao){
        this.dao=dao;
    }

}
