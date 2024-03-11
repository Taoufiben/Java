package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV22 {
    public static void main(String[] args) throws  ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Donne le nom du classe IDAO");
        String ClassName=scanner.nextLine();
        Class D=Class.forName(ClassName);
        IDao d=(IDao) D.getConstructor().newInstance();
        System.out.println("Donne le nom du classe Metier");
        String Met=scanner.nextLine();
        Class M=Class.forName(Met);
        IMetier m=(IMetier) M.getConstructor().newInstance();
        Method setData=M.getDeclaredMethod("setData",IDao.class);
        setData.invoke(m,d);

        System.out.println("RES :  "+m.calcul());
    }
}
