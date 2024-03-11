package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

public class PreseVerAnno {
    public static void main(String[] args) {
        ApplicationContext Con=new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier=Con.getBean(IMetier.class);
        System.out.println("Calcul "+metier.calcul());
    }
}
