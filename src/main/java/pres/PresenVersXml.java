package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresenVersXml {
    public static void main(String[] args) {
        ApplicationContext SpringContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=SpringContext.getBean(IMetier.class);
        System.out.println("REs "+metier.calcul());
    }
}
