package dao;

import org.springframework.stereotype.Component;

@Component("s")
public class DaoImplV2 implements IDao{

    @Override
    public double getData() {
        System.out.println("Web Service");
        double data=12;
        return data;
    }
}
