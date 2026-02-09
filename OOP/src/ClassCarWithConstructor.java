class Car1{
    String model;
    int speed;

    Car1(String modelName, int initialSpeed){
        model = modelName;
        speed = initialSpeed;
    }

    public void displaySpeed(){
        System.out.println("Model - " + model + " ,speed - " + speed);
    }
}

public class ClassCarWithConstructor {
    public static void main(String[] args) {
        Car1 myCar = new Car1("Tesla" , 120);
        myCar.displaySpeed();
    }
}