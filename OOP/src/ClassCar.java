class Car{
    String model;
    int speed;

    public void displaySpeed(){
        System.out.println("Model - " + model + " ,speed - " + speed);
    }
}

public class ClassCar {
    public static void main(String[] args) {
        Car mycar1 = new Car();
        mycar1.model = "Tesla";
        mycar1.speed = 120;

        mycar1.displaySpeed();
    }
}