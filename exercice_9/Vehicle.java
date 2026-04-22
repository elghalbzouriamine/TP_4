package exercice_9;

public abstract class Vehicle {
    double vitess;
    Vehicle(double vitess){
        this.vitess=vitess;
    }
    void accelerer(double amount){
        vitess+=amount;
        System.out.println("the current speed is :"+vitess);
    }
    void friener(double amount){
        if(vitess ==0)
            System.out.println("the car is already stopped!!!!!!");
        else
            vitess-=amount;
        System.out.println("the current speed is: "+vitess);
    }
    abstract void demarrer();
}
