package logic;

public class Car {
    private double mileAge;
    private int actualSpeed;

    public Car(double mileAge, int actualSpeed){
        this.mileAge=mileAge;
        this.actualSpeed = actualSpeed;
    }

    public double getMileAge() {
        return mileAge;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setMileAge(double mileAge) {
        this.mileAge = mileAge;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }
}
