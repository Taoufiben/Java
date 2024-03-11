package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(new File("config.txt"));
        String ClassName=scanner.nextLine();
        Class D=Class.forName(ClassName);
        IDao d=(IDao) D.getConstructor().newInstance();
        String Met=scanner.nextLine();
        Class M=Class.forName(Met);
         IMetier m=(IMetier) M.getConstructor().newInstance();
         Method setData=M.getDeclaredMethod("setData",IDao.class);
         setData.invoke(m,d);

        System.out.println("RES :  "+m.calcul());
    }
}
