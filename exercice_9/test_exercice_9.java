package exercice_9;

import com.sun.jdi.VMOutOfMemoryException;

public class test_exercice_9 {
    public static void main (String[] args){
        VoitureElectrique ve=new VoitureElectrique(80);
        Moto m=new Moto(120,"harley");
        ve.demarrer();
        ve.accelerer(20);
        ve.friener(30);
        ve.charger();
        ve.verifierBatterie();
        ve.verifierBatterie();

        m.demarrer();
        m.accelerer(234);
        m.friener(123);
        m.faireRoueArriere();
        m.faireRoueArriere();
    }
}
