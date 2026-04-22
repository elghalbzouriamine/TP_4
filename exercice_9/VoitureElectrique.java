package exercice_9;

 class VoitureElectrique extends Vehicle implements Electrique{
     private int batterie=100;

    VoitureElectrique(double vitess){
        super(vitess);
    }
    @Override
     void demarrer(){
        System.out.println("===========================================================");
        System.out.println("starts silently");
        System.out.println("===========================================================");
    }
    @Override
     public void charger(){
        System.out.println("===========================================================");
        batterie=100;
        System.out.println("battery charged!");
        System.out.println("===========================================================");
    }
    @Override
     public void verifierBatterie(){
        System.out.println("===========================================================");
        System.out.println("charging level: "+batterie+"%");
        System.out.println("===========================================================");

    }
    void AfficherAutonomie(){
        System.out.println("===========================================================");
        System.out.println("l'autonomie est: "+batterie*8+" km");
        System.out.println("===========================================================");
    }
    void optimiserConsomation(){
        System.out.println("===========================================================");
        System.out.println("turn off mode sport!!!!!!");
        System.out.println("===========================================================");
    }
}
