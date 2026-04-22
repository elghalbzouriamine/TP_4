package exercice_9;

public class Moto extends Vehicle{
    String motoType;
Moto(double vitess,String motoType){
    super(vitess);
    this.motoType=motoType;
}
    @Override
    void demarrer() {
        System.out.println("===========================================================");
        System.out.println("Vrum Vrum !");
        System.out.println("===========================================================");
    }

    void faireRoueArriere() {
        System.out.println("===========================================================");
        System.out.println("La moto fait une roue arrière !");
        System.out.println("===========================================================");
    }

    void afficherTypeMoto() {
        System.out.println("===========================================================");
        System.out.println("Type: "+motoType);
        System.out.println("===========================================================");
    }
}
