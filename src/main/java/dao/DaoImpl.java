package dao;

import org.springframework.stereotype.Component;

@Component("v")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("version de base de données");
        double data=34;
        return data;
    }
}
