class CoffeeMachine{
    private String coffeeName; //The name of the coffee
    private int waterAmount; //Amount of water in the tank, ml
    private int beansAmount; //Amount of the beans , grams

    CoffeeMachine(String coffeeName , int waterAmount , int beansAmount){
        this.coffeeName = coffeeName;
        this.waterAmount = waterAmount;
        this.beansAmount = beansAmount;
    }

    public void makeCoffee(){
        if (waterAmount >= 200 && beansAmount >= 20){
            waterAmount -= 200;
            beansAmount -= 20;
            System.out.println("Your " + coffeeName + " is ready.");
        }else System.out.println("Error. Not enough ingredients");
    }

    public void refill(int water , int beans){
        this.waterAmount += water;
        this.beansAmount += beans;
        System.out.println("Refill is over. ");
    }

    public void showStatus(){
        System.out.println("Water resudies: " + waterAmount +  ". Beans resudies: " + beansAmount);
    }
}


public class ClassCoffeMachine {
    public static void main(String[] args) {
        CoffeeMachine cup1 = new CoffeeMachine("Espresso" ,500 , 50);

        cup1.makeCoffee();
        cup1.makeCoffee();
        cup1.makeCoffee();
        cup1.showStatus();
        cup1.refill(100,10);
        cup1.makeCoffee();
        cup1.showStatus();
    }
}