package logic;

public class Car {
    private double mileAge;
    private int actualSpeed;

    public Car(double mileAge, int actualSpeed){
        this.mileAge=mileAge;
        this.actualSpeed = actualSpeed;
    }

    public void accelerate(){
        this.actualSpeed +=5;
    }
}
