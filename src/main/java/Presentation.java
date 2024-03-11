import dao.DaoImpl;
import dao.DaoImplV2;
import dao.IDao;
import metier.IMetier;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args) {
        IDao dao=new DaoImpl();
        MetierImp metier=new MetierImp();
        metier.setData(dao);
        System.out.println("le resultat "+metier.calcul());
    }
}
