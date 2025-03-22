package pres;

import dao.Daolmpl;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {
        Daolmpl d = new Daolmpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);
        System.out.println("Res="+metier.calcul());

    }
}
