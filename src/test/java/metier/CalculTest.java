package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul cal;
    @Test
    public void testSomme(){
        cal=new Calcul();
        double a=2,b=3;
        double ex=5;
        double res=cal.somme(a,b);
        Assert.assertTrue(res==ex);

    }
}
